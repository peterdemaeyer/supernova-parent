# Changes

## Since 1.0.0

* Defined UTF-8 as default source encoding.
* Defined Java 11 as default source and target version.
* Defined latest version of Maven plugins.
* Defined structure of multi-module projects.
* Enabled Surefire with sources in `src/test/java/`, pattern `**/*Test`.
Can be disabled with property `<supernova.surefire.skip>true</>`.
* Enabled Failsafe with sources in `src/test/java/`, pattern `**/*IntegrationTest`.
Can be disabled with property `<supernova.failsafe.skip>true</>`.
* Enabled Invoker with sources in `src/integration-test/maven/`.
Can be disabled with property `<supernova.invoker.skip>true</>`.

## Bug fixes

* Bumped versions of various dependencies.

## 1.1.1

* Fixed bug such that 

## 1.1.0

### Compatible API

* Use `maven-enforcer-plugin` to make sure release versions only depend on release versions.
  Snapshots may depend on snapshots.

## 1.0.0

### Incompatible API changes

Definition of Supernova standards:

* Common dependencies and versions in `dependencyManagement` section.
* Code coverage must be 100 %.
* Flatten poms.
