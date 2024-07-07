# Supernova Conventions

Indent using tabs, not spaces.

Rationale: using tabs does not rely on fixed-width fonts, allows users to define their indentation size per tab either
in spaces or even in cm or px, and they consume less characters.

Text files must end with a line separator.

## XML

See CheckStyle configuration.

## Java

See CheckStyle configuration.

Exception messages must be phrases and not sentences, using sentence case.
They must start with a lowercase letter and _not_ end with a punctuation mark.

Log messages must be sentences using sentence case. They must start with an uppercase letter and end with a punctuation
mark.

# Ubiquitous language

Use "directory" instead of "folder".

Use perfect antonyms.
For example, use "log in" and "log out", not "log in" and "log off" (the antonym of "off" being "on").

Use "log in/out" instead of "log on/off" or "sign in/out".

Suffix directories (or any non-leaf paths) with a slash so that it is clear from the path name that it's a directory.
For example use "http://my.site.com/" instead of "http://my.site.com".

# Test conventions

Unit test classes must end with `Test`.

Integration test classes must end with `IntegrationTest`.

Test classes and methods must be package-private by default.
They may be public, but only for a specific reason.

Test methods must _not_ start with `test`.
The `@Test` annotation alone is clear enough,
and prefixing every method with `test` clutters screen real estate that needs to be mentally ignored by the reader.

Test methods must be camel-cased as regular methods, and must _not_ contain spaces.
A good test method name completes the phrase "test that ...".

Tests must always load resources from the class path.
Never assume resources are files.
This ensures that tests can be run from within a `*-tests.jar` or that test resources from dependencies can be reused.

Test resources must reside in the directory corresponding to the package and class the resource is for.
Resources common to tests may be in the package root.
Resources specific to a particular test must be in a subdirectory relative to

Envision tests that obey a "given-when-then" structure.
Use the test fixture (the for each/for all and fields of the test class) for environmental setup,
but not to set up the object under test.
Instantiate the object under test in every test, instead of in the test fixture.
Prefer the method under test (the "when" part of the "given-when-then" structure) to be an API calls of the object under test.
Prefer calling the API of the object under test rather than having to make package-private methods `@VisibleForTesting`.

# Build standards

Release versions must only depend on other release versions, never on snapshots.
This includes parent projects, which are considered a form of dependencies.
Snapshot versions may depend on snapshot versions (also for parents).
This is enforced by the `maven-enforcer-plugin`.

All code must be covered 100% with unit tests by default.
This is enforced by the `jacoco-maven-plugin`.

# Project conventions

## Production sources

Production source code is in `src/main/<language>/`, for example `src/main/java/` or `src/main/bash/`.
Production resources are in `src/main/resources/`.
Production Java code is compiled to `target/classes/`.
Production Java classes and their corresponding resources are packaged in the main jar artifact without classifier.

## Test sources

Unit test source code is in `src/test/<language>/`, for example `src/test/java/`.
Unit test resources are in `src/test/resources/`.
Integration test code is in `src/integration-test/<language>/`, for example `src/integration-test/java/` for Failsafe 
or `src/integration-test/maven/` for Invoker.
Integration test resources are in `src/integration-test/resources/`.
Test Java code is compiled to `target/test-classes/` (both unit and integration test code).
Test Java classes and their corresponding resources are packaged in the test-jar artifact with classifier `tests`.
Bear in mind that the main difference between unit and integration tests is _when_ they run.
Unit tests run after compilation but before packaging, while integration tests run after packaging.
That means you can only test packaging in an integration test.
