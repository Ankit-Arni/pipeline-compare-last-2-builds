def compareCurrentAndPrevious() {
    if(currentBuild.result == null)
        currentBuild.result = 'SUCCESS'
    def previousBuild = currentBuild.getPreviousBuild()
    println "Build: ${currentBuild.number} | Result: ${currentBuild.result}"
    println "Build: ${previousBuild.number} | Result: ${previousBuild.result}"
    if (currentBuild.result != previousBuild.result)
        println "Build result has changed: Previous build = ${previousBuild.result} -> Current build = ${currentBuild.result}"
    else    
        println "Build result has not changed: Still ${currentBuild.result}"
}
