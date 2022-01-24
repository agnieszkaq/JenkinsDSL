job('SPR') {
    scm {
        git('git://github.com/wardviaene/docker-demo.git') {  
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("ls ")
    }
}
