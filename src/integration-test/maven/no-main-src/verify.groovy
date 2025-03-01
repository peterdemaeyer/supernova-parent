import java.nio.charset.Charset.*
import java.nio.file.Files.*
import java.nio.file.Path
import java.util.Map.*

import static java.nio.charset.StandardCharsets.UTF_8
import static java.nio.file.Files.exists
import static java.nio.file.Files.exists
import static java.nio.file.Files.exists
import static java.nio.file.Files.exists
import static java.nio.file.Files.readString

Path baseDir = basedir.toPath()
Path buildLogFile = baseDir.resolve("build.log")
String buildLogFileContent = readString(buildLogFile, UTF_8)
!buildLogFileContent.contains("[ERROR]")
// Below can't be enabled because of a warning about no main jar.
//!buildLogFileContent.contains("[WARNING]")

Path targetDir = baseDir.resolve("target")
!exists(targetDir.resolve("no-main-src-1.0.0-SNAPSHOT.jar"))
// Below doesn't work because of MSOURCES-150.
//!exists(targetDir.resolve("no-main-src-1.0.0-SNAPSHOT-sources.jar"))
exists(targetDir.resolve("no-main-src-1.0.0-SNAPSHOT-tests.jar"))
exists(targetDir.resolve("no-main-src-1.0.0-SNAPSHOT-test-sources.jar"))
