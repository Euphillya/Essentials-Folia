rootProject.name = "Essentials-Folia"

val patchedDir = file("Essentials-Patched")
if (patchedDir.exists()) {
    includeBuild(patchedDir)
}