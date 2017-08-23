@Library('pipeline-compare-last-2-builds@master')
import Jenkins.model.*
node {
    def currentJob = System.getenv('JOB_NAME')
    echo "{$currentJob}"
    
    try {
        stage 'Checkout'
        git credentialsId: 'GITHUB_CRED', url: 'https://github.com/Ankit-Arni/time-tracker.git'
    
        stage 'Clean & package'
        bat 'mvn -e clean package'
    }
    catch (Exception e)
    {
        e.printStackTrace()
    }
    finally {
        stage 'Compare current & previous builds'
        def result = new CompareBuildResults()
        result.compareCurrentAndPrevious()
    }
}
