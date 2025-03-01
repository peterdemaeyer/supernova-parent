import java.nio.charset.Charset.*
import java.nio.file.Files.*
import java.nio.file.Path
import java.util.Map.*

import static java.nio.charset.StandardCharsets.UTF_8
import static java.nio.file.Files.readString
import static java.nio.file.Files.exists

Path baseDir = basedir.toPath()

Path buildLogFile = baseDir.resolve("build.log")
String buildLogFileContent = readString(buildLogFile, UTF_8)
!buildLogFileContent.contains("[ERROR]")
//!buildLogFileContent.contains("[WARNING]")

Path targetDir = baseDir.resolve("target")
exists(targetDir.resolve("no-test-src-1.0.0-SNAPSHOT.jar"))
exists(targetDir.resolve("no-test-src-1.0.0-SNAPSHOT-sources.jar"))
!exists(targetDir.resolve("no-test-src-1.0.0-SNAPSHOT-tests.jar"))
!exists(targetDir.resolve("no-test-src-1.0.0-SNAPSHOT-test-sources.jar"))
