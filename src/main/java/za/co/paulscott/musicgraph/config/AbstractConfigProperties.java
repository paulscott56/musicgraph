package za.co.paulscott.musicgraph.config;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.ConfigurableEnvironment;

public abstract class AbstractConfigProperties {

	private Logger log = LoggerFactory.getLogger(this.getClass().getName());

	private ConfigurableEnvironment env;

	public AbstractConfigProperties(ConfigurableEnvironment env) {
		this.env = env;
	}

	public Object getProperty(Method method) {

		if (!method.isAnnotationPresent(ConfigProperty.class)) {
			throw new ConfigException("Method [" + method.getName()
					+ "] is missing @ConfigProperty.");
		}

		ConfigProperty mapping = method.getAnnotation(ConfigProperty.class);

		String key = mapping.value();
		String value = null;
		if (mapping.isMandatory()) {
			value = env.getRequiredProperty(key);
		} else {
			value = env.getProperty(key, mapping.fallback());
		}

		if (mapping.isPassword()) {
			log.info("--> {} = {}", key, value.replaceAll(".", "*"));
		} else {
			log.info("--> {} = {}", key, value);
		}

		return convertObject(value, method.getReturnType());
	}

	private Object convertObject(String value, Class<?> returnType) {

		if ("boolean".equals(returnType.getName())
				|| "java.lang.Boolean".equals(returnType.getName())) {
			return Boolean.parseBoolean(value);
		} else if ("int".equals(returnType.getName())
				|| "java.lang.Integer".equals(returnType.getName())) {
			return Integer.parseInt(value);
		} else if ("long".equals(returnType.getName())
				|| "java.lang.Long".equals(returnType.getName())) {
			return Long.parseLong(value);
		} else if ("java.lang.String".equals(returnType.getName())) {
			return value;
		} else if ("java.util.List".equals(returnType.getName())) {
			return Arrays.asList(value.split(","));
		}

		throw new ConfigException("Unsupported return type: "
				+ returnType.getName());
	}

}
