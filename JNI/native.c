#include "jni.h"
#include "HelloJNI.h"
#include<stdio.h>
JNIEXPORT void JNICALL Java_HelloJNI_hellojni(JNIEnv *env, jobject thisObj){
	printf("Ending the native method.\n");
}