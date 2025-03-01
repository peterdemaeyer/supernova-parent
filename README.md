# Supernova Parent

This Supernova Parent project defines standards for projects.
Projects that have this project as a parent inherit a number of features.
By design, the parent offers standards but does not impose them,
meaning that all features it has to offer can be disabled or overridden. 

# Features

## Version updates of common plugins

This parent project maintains the latest versions of plugins so that child projects don't have to.
It is recommended that child projects rely on the versions provided by this parent,
but may also choose to override them if needed.

## Version updates of common dependencies

This parent project maintains the latest versions of dependencies so that child projects don't have to.
It is recommended that child projects rely on the versions provided by this parent,
but may also choose to override them if needed.

# Standards

This and child projects follow [Semantic Versioning](https://semver.org/).
Incompatible API changes require a new major version.
Compatible API changes require a new minor version.
Compatible bug fixes require a new patch version.

|Release versions must only depend on release versions. Release versions must thus not depend on any snapshot|
|100% code coverage by default.|
|Dependency management has dependencies of preferred third-party dependencies only.
Individual project may have additional (test) dependencies.|

# Definitions

An aggregator project

## Principles

Ultimately agile.
Everything must be made with change in mind.
For every imaginable change, there must be a process that supports it, however infrequent.
"We realize this is imperfect, but it's a design choice which is cast in stone" is never an acceptable answer.

Consistency.
A rule which requires fewer exceptions is preferable. 
Taste plays only a minor role in any choice.

Never wonder how.
There must be rules for everything, such that one does never have to wonder "how should I do this?"
Should logging statements be in sentence case starting with a capital letter and ending with a full stop?
How should I start the first sentence of my Javadoc?
There must be rules for everything.

Convention over enforcement.
Conventions must be followed even if they're not enforced.
If possible, conventions must be enforced for example in code style, but the absence of enforcement must not be a reason
to ignore a convention.

## Standards

100 % code coverage. If possible within the module, if necessary in an aggregator module.

In text files, such as `.md`, `.xml` and Javadoc in `.java` files, all sentences must start on a new line.
Long sentences must be wrapped so that lines never exceed 120 characters.

## (Maven) project structure

Versions of common dependencies (and plugins) must be defined in the Supernova BOM, following the lower-dash-case
convention `<common-part-of-project-id.version>`.
Examples: `<maven-compiler-plugin.version>`, or `<log4j.version>` where "log4j" is the common part of "log4j-api",
"log4j-core", "log4j-slf4j-impl", ... which are all released simultaneously as separate artifacts with a common version. 

Projects must inherit from the Supernova BOM (this project).
They must refer to their parent with `<relativePath/>`, so that the parent is loaded from the repository (as opposed to
looked up in a directory structure).

Multi-module projects must follow the naming convention:

||Directory name||Artifact name||
|`supernova-my-project` (which equals the repository name on GitHub)|`my-project-parent`|
|`\- my-project`|`my-project` |
|`\- my-project-
