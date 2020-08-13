javac Test.java
ALL_CLASSES=$(ls | grep ".class")

if [[ ! -d class ]]; then
    mkdir class
    echo "INFO: Created class directory"
else
    echo "INFO: class directory exists"
fi

echo "INFO: Following are the classes created"
for class in $ALL_CLASSES
do
    echo "$class"
    mv $class class/
done

echo "INFO: Moved all classes to class directory"

