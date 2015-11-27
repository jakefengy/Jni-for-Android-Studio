# JniExample
Jni for Android Studio

展示如何在Android Studio中使用NDK，详情参考
  Android-NDK:http://developer.android.com/ndk/guides/index.html
  Example xx :http://ph0b.com/android-studio-gradle-and-ndk-integration/
  
1、创建Android Studio项目，在MainActivity中添加native方法，并Build-Make Project
  public native String getStringFromNative();

2、打开Terminal tab，输入javah命令，生成.h到app\src\main\jni
  javah -d app\src\main\jni -classpath app\build\intermediates\classes\debug com.example.jni.MainActivity

3、app\src\main\jni下创建hello.c和util.c文件
  hello.c：native 方法的具体实现
  util.c ：空文件
4、添加ndk.dir到local.properties
  手动添加ndk.dir或进入项目设置，添加本地ndk路径
5、完成步骤3、4后Build-Make Project，app\build\intermediates\ndk\debug\lib下面是生成的所有平台的.so文件
6、引用.so
    a、打开app\build.gradle，添加
      ndk {
            moduleName "JniExample"
          }
    b、打开MainActivity.java，在onCreate中添加native方法的调用
      Toast.makeText(this,getStringFromNative(),Toast.LENGTH_SHORT).show();
7、运行app
