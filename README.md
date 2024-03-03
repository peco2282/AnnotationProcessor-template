# Annotation processor development template

This template is for creating a library of annotation processors.

It is intended to be used with intellij idea.

## Usage

Define annotations in [this project](./annotator/annotator).

Define your processor in [this project](./annotator/processor).

Now write the client source code in [this project](./src).

processor example

```java
@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_18)
public class CustomProcessor extends AbstractProcessor {
  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    annotations.forEach(element ->
        processingEnv.getMessager().printMessage(Kind.NOTE, element.getSimpleName() + " " + element.getQualifiedName())
    );
    return true;
  }
}
```

Executing the client-side main method executes the processor.

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

[MIT](https://choosealicense.com/licenses/mit/)