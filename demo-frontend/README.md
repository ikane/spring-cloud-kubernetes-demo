#Creating docker container image
    docker build --file=Dockerfile --tag=ikane/demo-frontend:latest --rm=true .

# Deploying to kubernetes
    kubectl create -f frontend-deployment.yaml
    
# Checking...
    kubectl get deployments
    kubectl get services