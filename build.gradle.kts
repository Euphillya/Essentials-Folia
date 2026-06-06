plugins {
    id("ca.stellardrift.gitpatcher") version "2.0.0"
}

gitPatcher {
    patchedRepos {
        register("essentials") {
            submodule = "Essentials"
            target = file("Essentials-Patched")
            patches = file("patches")
        }
    }
}
