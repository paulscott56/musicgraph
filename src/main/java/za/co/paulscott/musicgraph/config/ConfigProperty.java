package za.co.paulscott.musicgraph.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
public @interface ConfigProperty {

	/**
	 * The name of the property to return for the associated getter method.
	 * 
	 * @return the string
	 */
	String value() default "";

	/**
	 * Indicates whether the field is a password If it is then the value will
	 * not be displayed in log files.
	 * 
	 * @return true/false to indicate that this field is a password
	 */
	public abstract boolean isPassword() default false;

	public abstract boolean isMandatory() default true;

	public abstract String fallback() default "";
}
