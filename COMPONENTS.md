# Components explained


## Course elements (nodes)
To appear in the course list an extension needs to have a spring configuration
of the type *CourseNodeConfiguration*


## Translations

## Forms

## Configuration

Configuration values are managed in the environment directory. There are
4 interfaces there. One shared main class
and one for *development*, *testing* and *production* each.

Properties and shared methods for accessing configuration are defined here:

```java

    @Profile(DEVELOPMENT)
    public interface EpisDevelopmentAndTestingEnvironmentProperties extends EpisEnvironmentProperties {


	    @Override
	    default boolean isFallbackToSapImportTestFilesEnabled() {
		    return true;
	    }
	}
```

Environment are meant to replace the classic *olat.local.properties*. The
advantage of using environments is ... TBD.

What is *PRODUCTION_COMPILATION_DEVELOPMENT*? TBD

