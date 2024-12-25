plugins {
    id("fpgradle-minecraft") version ("0.10.0")
}

group = "com.dreammaster"

minecraft_fp {
    mod {
        modid = "dreamcraft"
        name = "Core"
        rootPkg = "$group"
    }

    tokens {
        tokenClass = "Tags"
    }
}

repositories {
    ic2EX()
    cursemavenEX()
    modrinthEX()
    exclusive(horizon(), "com.github.GTNewHorizons")
    exclusive(mega(), "gtmega", "mega", "codechicken")
    exclusive(mega_uploads {
        metadataSources {
            mavenPom()
            artifact()
        }
    }) {
        includeGroup("mega.mirror")
        includeModule("mega", "Railcraft")
    }
}

dependencies {
    implementation("com.github.GTNewHorizons:Yamcl:0.5.84:dev")
    compileOnly("com.github.GTNewHorizons:AppleCore:3.2.0:dev") {
        excludeDeps()
    }

    implementation("codechicken:codechickencore-mc1.7.10:1.4.0-mega:dev")
    implementation("codechicken:notenoughitems-mc1.7.10:2.3.1-mega:dev") {
        excludeDeps()
    }

    implementation ("net.industrial-craft:industrialcraft-2:2.2.828-experimental:dev")
    implementation("gtmega:gt5u-mc1.7.10:5.40.0-a0004:dev") {
        excludeDeps()
    }

    implementation ("gtmega:ae2-mc1.7.10:rv3-beta.58-gtmega:dev")

    implementation ("com.github.GTNewHorizons:Railcraft:9.15.0:dev") {
        excludeDeps()
    }

    compileOnly("mega.mirror:EnderIO:1.7.10-2.3.2:dev") {
        excludeDeps()
    }
    implementation("com.github.GTNewHorizons:EnderCore:0.2.9:dev") {
        excludeDeps()
    }

    implementation (deobfCurse("thaumcraft-223628:2227552"))

    compileOnly("com.github.GTNewHorizons:BuildCraft:7.1.27:dev")
    compileOnly("mega.mirror:HardcoreEnderExpansion-mc1.7.10:1.8.6")
    compileOnly("mega.mirror:twilightforest:1.7.10-2.3.8.5:dev")
    implementation("mega:structurelib-mc1.7.10:1.2.6-mega:dev")
    compileOnly("mega:forestry-mc1.7.10:4.5.3-mega:dev") {
        excludeDeps()
    }
}