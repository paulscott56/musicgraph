package za.co.paulscott.musicgraph.config;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.util.StringUtils;

public class PropertiesLoader {
	private static final String DEFAULT_PROFILE = "default";

	private Logger log = LoggerFactory.getLogger(this.getClass());

	public void loadProperties(ConfigurableEnvironment env,
			ConfigProperties properties) {

		String classpathProperties = properties.classpath();
		if (!StringUtils.isEmpty(classpathProperties)) {
			loadPropertiesFromClassPath(env, classpathProperties);
		}

		String fileProperties = properties.file();
		if (!StringUtils.isEmpty(fileProperties)) {
			loadPropertiesFromFile(env, fileProperties);
		}

	}

	private void loadPropertiesFromClassPath(ConfigurableEnvironment env,
			String classpathProperties) {

		String[] activeProfiles = env.getActiveProfiles();

		for (String resourcePath : resolveClasspathResources(activeProfiles,
				classpathProperties)) {

			log.info(
					"--> Attempting to load properties from {} in the classpath [Lowest precedence]",
					resourcePath);

			try {
				ResourcePropertySource source = new ResourcePropertySource(
						new ClassPathResource(resourcePath));
				if (source != null) {
					env.getPropertySources().addLast(source);
					log.info(
							"----> Loading properties file: {} [Lowest precedence]",
							resourcePath);
				}
			} catch (Exception e) {
				log.warn(
						"----> Unable to load properties file: {} from classpath",
						resourcePath);
				// log.warn("----> Falling back to properties contained in the environment");
			}
		}

	}

	private Set<String> resolveClasspathResources(String[] activeProfiles, String classpathProperties) {

            Set<String> classpathResources = new HashSet<>();

            if (activeProfiles.length == 0) {
                    classpathResources.add(DEFAULT_PROFILE + "_" + classpathProperties);
                    return classpathResources;
            }

            for (String profile : activeProfiles) {
                    String resourcePath = profile.toLowerCase() + "_" + classpathProperties;
                    classpathResources.add(resourcePath);
            }

            return classpathResources;
    }

	private void loadPropertiesFromFile(ConfigurableEnvironment env, String file) {

		String loc = "file://" + env.resolvePlaceholders(file);
		log.info(
				"--> Attempting to load properties from {} from the filesystem [Higest precedence]",
				loc);

		try {
			ResourcePropertySource source = new ResourcePropertySource(
					new UrlResource(loc));
			if (source != null) {
				env.getPropertySources().addFirst(source);
				log.info(
						"----> Loading properties file: {} [Highest precedence]",
						loc);
			}
		} catch (Exception e) {
			log.warn(
					"----> Unable to load properties file: {} from filesystem",
					loc);
			log.warn("----> Falling back to properties contained in the environment");
		}
	}
}
