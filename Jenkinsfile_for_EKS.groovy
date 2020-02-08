node{
    stage("Pull Repo"){
        ws {
            git 'https://github.com/sera-ab/terraform_EKS.git'
        }
        
    }
    stage("Download Terraform"){
        ws {
            sh "terraform version"
            sh "wget https://releases.hashicorp.com/terraform/0.12.19/terraform_0.12.19_linux_amd64.zip"
            sh "unzip -o terraform_0.12.19_linux_amd64.zip"
            sh "./terraform version"}
    }
    stage("Set Backend"){
        ws {
            sh "source setenv.sh configurations/dev/us-west-2/dev.tfvars"
        }
    }
    stage("stage1"){
        echo "Hello"

    }
}
