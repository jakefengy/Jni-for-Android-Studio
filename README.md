# JniExample
Jni for Android Studio

展示如何在Android Studio中使用NDK，详情参考</p>
  Android-NDK:http://developer.android.com/ndk/guides/index.html</p>
  Example xx :http://ph0b.com/android-studio-gradle-and-ndk-integration/</p>
  
1、创建Android Studio项目，在MainActivity中添加native方法，并Build-Make Project</p>
  public native String getStringFromNative();</p>

2、打开Terminal tab，输入javah命令，生成.h到app\src\main\jni</p>
  javah -d app\src\main\jni -classpath app\build\intermediates\classes\debug com.example.jni.MainActivity</p>

3、app\src\main\jni下创建hello.c和util.c文件</p>
  hello.c：native 方法的具体实现</p>
  util.c ：空文件</p>
4、添加ndk.dir到local.properties</p>
  手动添加ndk.dir或进入项目设置，添加本地ndk路径</p>
5、完成步骤3、4后Build-Make Project，app\build\intermediates\ndk\debug\lib下面是生成的所有平台的.so文件</p>
6、引用.so</p>
    a、打开app\build.gradle，添加</p>
      ndk {</p>
            moduleName "JniExample"</p>
          }</p>
    b、打开MainActivity.java，在onCreate中添加native方法的调用</p>
      Toast.makeText(this,getStringFromNative(),Toast.LENGTH_SHORT).show();</p>
7、运行app
