import java.nio.charset.Charset.*
import java.nio.file.Files.*
import java.nio.file.Path
import java.util.Map.*

import static java.nio.charset.StandardCharsets.UTF_8
import static java.nio.file.Files.readAllLines

Path buildLogFile = basedir.toPath().resolve("build.log")
List<String> buildLogFileLines = readAllLines(buildLogFile, UTF_8)
buildLogFileLines.contains("[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0")
buildLogFileLines.contains("[ERROR]   SurefireInclusionsTest.surefireInclusionPattern:9")
