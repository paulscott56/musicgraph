package za.co.paulscott.musicgraph.config;

public class ConfigException extends RuntimeException {
	
        private static final long serialVersionUID = 1L;

        public ConfigException(String message, Throwable cause) {
                super(message, cause);
        }

        public ConfigException(String message) {
                super(message);
        }

}
