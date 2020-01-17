/*
 * Copyright: 2020 forchange Inc. All rights reserved.
 */

package dev.research.jvm.anno;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.util.ElementFilter;
import java.lang.reflect.Modifier;
import java.util.Set;

/**
 * @fileName: CheckGetterProcessor.java
 * @description: CheckGetterProcessor.java类说明
 * @author: by echo huang
 * @date: 2020-01-16 15:22
 */
@SupportedAnnotationTypes("dev.research.jvm.anno.CheckGetter")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class CheckGetterProcessor implements Processor {
    @Override
    public Set<String> getSupportedOptions() {
        return null;
    }

    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return null;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return null;
    }

    @Override
    public void init(ProcessingEnvironment processingEnv) {
        System.out.println(processingEnv.getMessager());
    }

    /**
     * 这个方法将接收两个参数，分别代表该注解处理器所能处理的注解类型，以及囊括当前轮生成的抽象语法树的RoundEnvironment。
     * process方法涉及各种不同类型的Element，分别指代 Java 程序中的各个结构。
     * 如TypeElement指代类或者接口，VariableElement指代字段、局部变量、enum 常量等，ExecutableElement指代方法或者构造器。
     * @param annotations 注解处理器所能处理的注解类型
     * @param roundEnv 当前轮生成的抽象语法树的RoundEnvironment
     * @return
     */
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        //获取被@CheckGetter的类
        for (TypeElement annotatedClass : ElementFilter.typesIn(roundEnv.getElementsAnnotatedWith(CheckGetter.class))) {
            for (VariableElement field : ElementFilter.fieldsIn(annotatedClass.getEnclosedElements())) {
                if (!containsGetter(annotatedClass, field.getSimpleName().toString())) {
                    System.out.println(String.format("getter not found for '%s.%s'.", annotatedClass.getSimpleName(), field.getSimpleName()));
                }
            }
        }
        return true;
    }

    private static boolean containsGetter(TypeElement typeElement, String name) {
        String getter = "get" + name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (ExecutableElement executableElement : ElementFilter.methodsIn(typeElement.getEnclosedElements())) {
            if (!executableElement.getModifiers().contains(Modifier.STATIC)
                    && executableElement.getSimpleName().toString().equals(getter)
                    && executableElement.getParameters().isEmpty()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation, ExecutableElement member, String userText) {
        return null;
    }
}
