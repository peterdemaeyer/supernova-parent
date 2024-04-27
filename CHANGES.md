# Changes

This and child projects follow [Semantic Versioning](https://semver.org/).
Incompatible API changes require a new major version.
Compatible API changes require a new minor version.
Compatible bug fixes require a new patch version. 

## 1.0.0

### Incompatible API changes

* Bumped binary compatibility from Java 1.8 to Java 11.

### Compatible API changes

* Defined structure of multi-module projects.

### Compatible bug fixes

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
