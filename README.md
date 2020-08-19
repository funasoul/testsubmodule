# testsubmodule
test submodule repo

# How to use
```sh
git clone git@github.com:funasoul/testsubmodule.git
cd testsubmodule
git submodule update --init
mvn install
cd target
java -cp wrap-1.0-SNAPSHOT-jar-with-dependencies.jar jp.ac.keio.bio.fun.wrapper.App
```
