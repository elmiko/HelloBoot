test of java s2i stuff

quickstart

1. `oc new-project helloboot`
1. `oc create -f openshift-resources.yaml`
1. `oc new-app --template oshinko-java-spark-build-dc -p APPLICATION_NAME=helloboot -p GIT_URI=https://github.com/elmiko/HelloBoot -p APP_FILE=HelloBoot-0.0.1-SNAPSHOT.jar -p OSHINKO_CLUSTER_NAME=hbspark`

this will cause the app to be loaded from the `github.com/elmiko/HelloBoot`
repository, built in openshift, and deployed using the source-to-image
methodology.
