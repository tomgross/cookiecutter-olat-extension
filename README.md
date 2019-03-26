# Cookiecutter template for OLAT extensions

## Requirements

 * Local OLAT development sandbox (see https://help.olat.uzh.ch/display/goto/OLAT-Development)
 * Python 3
 * Cookiecutter `brew install cookiecutter` or `pip install cookiecutter`

## Usage

Create submodule in *lmsuzh-extension-DEVELOPMENT*:
 
```bash

 $ cookiecutter https://github.com/tomgross/cookiecutter-olat-extension

```

Include submodule in main *pom.xml*:

 
```xml

	<modules>
...
		<module>lmsuzh-extension-myapp</module>
...
    </modules>

```

Include submodule as dependency in *lmsuzh-extension-config*:


```xml

	<dependencies>
	    ...
		<dependency>
			<groupId>ch.uzh.extension</groupId>
			<artifactId>lmsuzh-extension-myapp</artifactId>
			<version>${project.version}</version>
		</dependency>
    </dependencies>
```

and  *LmsuzhProductionEnvironmentProperties*,
*LmsuzhTestingEnvironmentProperties*, *LmsuzhDevelopmentEnvironmentProperties*
properties:

```java

package ch.uzh.extension.config.properties;

/* ... more imports ... */
import ch.uzh.extension.myapp.environment.MyappProductionEnvironmentProperties;


@Component
@Profile(PRODUCTION)
public class LmsuzhProductionEnvironmentProperties implements
    /* ... more implements ... */
	MyappProductionEnvironmentProperties {
}
```

Add pointer to spring context in *lmsuzh-extension-config/src/main/resources/configContext.xml*:

```xml

 <import resource="classpath:myappContext.xml" />

```
 
## Testing

Integration Testing assumes you have a PostgreSQL database
running with the following specs:

 * PostgreSQL *9.4* to *10*
 * Port: *5432* (Standard PostgreSQL port)
 * Database: *olattest*
 * User owning database: *olat*
 * User password: *olat*

Before running the tests you need to bootstrap the structure:

```bash

 $ cd openolat-lms-DEVELOPMENT/src/main/resources/database/postgresql
 $ psql -h localhost olattest olat  < setupDatabase.sql

```
