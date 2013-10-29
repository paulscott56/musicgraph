package za.co.paulscott.musicgraph.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
public @interface ConfigProperties {

	/**
	 * A properties file to load from the classpath, with lowest precedence.
	 * 
	 * @return the string
	 */
	public abstract String classpath() default "";

	/**
	 * A properties file to load from a file, with highest precedence. The path
	 * can contain ${..} values which will be resolved using the
	 * <code>Environment</code> class.
	 * 
	 * @return the string
	 */
	public abstract String file() default "";

}
