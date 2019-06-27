pipeline {
    agent any 
    stage('checkout'){
        //必须有，该checkout步骤将检出从源控制代码; scm是一个特殊变量，指示checkout步骤克隆触发此Pipeline运行的特定修订。
        checkout scm
    }
    stages {
        stage('Build') {
            steps {
                echo 'Hello world!' 
            }
        }
    }
}
