import java.nio.charset.Charset.*
import java.nio.file.Files.*
import java.nio.file.Path
import java.util.Map.*

import static java.nio.charset.StandardCharsets.UTF_8
import static java.nio.file.Files.readString

Path buildLogFile = basedir.toPath().resolve("build.log")
String buildLogFileContent = readString(buildLogFile, UTF_8)
!buildLogFileContent.contains("[ERROR]")
!buildLogFileContent.contains("[WARNING]")
