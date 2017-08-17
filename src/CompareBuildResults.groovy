def compareCurrentAndPrevious() {
    if(currentBuild.result == null)
        currentBuild.result = 'SUCCESS'
    def previousBuild = currentBuild.getPreviousBuild()
    echo "Build: ${currentBuild.number} | Result: ${currentBuild.result}"
    echo "Build: ${previousBuild.number} | Result: ${previousBuild.result}"
    if (currentBuild.result != previousBuild.result)
        echo "Build result has changed: Previous build = ${previousBuild.result} -> Current build = ${currentBuild.result}"
    else    
        echo "Build result has not changed: Still ${currentBuild.result}"
}
