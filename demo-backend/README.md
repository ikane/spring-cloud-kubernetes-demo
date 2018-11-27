#Creating docker container image
    docker build --file=Dockerfile --tag=ikane/demo-backend:latest --rm=true .

# Deploying to kubernetes
    kubectl create -f backend-deployment.yaml
    
# Checking...
    kubectl get deployments
    kubectl get services