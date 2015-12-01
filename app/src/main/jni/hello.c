
#include <com_example_jni_JniUtils.h>

/*
 * Class:     com_example_jni_MainActivity
 * Method:    getStringFromNative
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_com_example_jni_JniUtils_getStringFromNative
  (JNIEnv * env, jobject obj){
    return (*env)->NewStringUTF(env,"Hello From JNI !");
}
