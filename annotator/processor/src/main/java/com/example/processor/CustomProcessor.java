package com.example.processor;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;
import java.util.Set;

@SupportedAnnotationTypes("*")
@SupportedSourceVersion(SourceVersion.RELEASE_18)
public class CustomProcessor extends AbstractProcessor {
  /**
   * {@inheritDoc}
   *
   * @param annotations
   * @param roundEnv
   */
  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    annotations.forEach(element ->
        processingEnv.getMessager().printMessage(Kind.NOTE,element.getSimpleName() + " " + element.getQualifiedName())
    );
    return true;
  }
}
