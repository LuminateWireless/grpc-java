package(default_visibility = ['//visibility:public'])

licenses(['notice'])

cc_binary(
  name = 'grpc_java_plugin',
  nocopts = '-Werror',
  srcs = [
    'compiler/src/java_plugin/cpp/java_generator.cpp',
    'compiler/src/java_plugin/cpp/java_generator.h',
    'compiler/src/java_plugin/cpp/java_plugin.cpp',
  ],
  deps = [
    '//external:protobuf_compiler',
  ]
)

java_library(
  name = 'auth',
  srcs = glob([
    'auth/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/java/google-auth-library:credentials',
    '//third_party/java/google-oauth-client',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',

  ],
)

java_library(
  name = 'core',
  srcs = glob([
    'core/src/main/java/**/*.java'
  ]),
  deps = [
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
    '//java/com/luminate/logs:grpc-log',
    '//logs:log-message_java',
  ],
)

java_library(
  name = 'netty',
  srcs = glob([
    'netty/src/main/java/**/*.java'
  ]),
  resources = glob([
    'netty/src/main/resources/**/*'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
    '//third_party/java/netty',
  ],
  exports = [
    '//third_party/java/netty',
  ],
)

java_library(
  name = 'protobuf',
  srcs = glob([
    'protobuf/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/protobuf:java_proto',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
  ],
)

java_library(
  name = 'okhttp',
  srcs = glob([
    'okhttp/src/main/java/**/*.java'
  ]),
  resources = glob([
    'okhttp/src/main/resources/**/*'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
    '//third_party/java/okhttp',
    '//third_party/java/okio',
  ],
)

java_library(
  name = 'stub',
  srcs = glob([
    'stub/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
  ],
)

java_library(
  name = 'grpc-java',
  exports = [
    ':auth',
    ':core',
    ':netty',
    ':protobuf',
    ':stub',
    '//third_party/java/guava',
    '//third_party/java/jsr305_annotations',
    '//third_party/protobuf:java_proto',
  ]
)

# Testing
java_library(
  name = 'testing',
  srcs = glob([
    'testing/src/main/**/*.java',
  ]),
  deps = [
    ':grpc-java',
  ],
  testonly = 1,
)

java_library(
  name = 'interop',
  srcs = glob([
    'interop-testing/src/generated/**/*.java',
    'interop-testing/src/main/**/*.java',
  ]),
  testonly = 1,
  deps = [
    ':grpc-java',
    ':testing',
    ':netty',
    '//third_party/java/google-auth-library:oauth2_http',
    '//third_party/java/junit',
    '//third_party/java/mockito',
    '//third_party/java/netty',
  ],
)

java_test(
  name = 'interop_test',
  srcs = glob([
    'interop-testing/src/test/**/*.java',
  ]),
  deps = [
    ':grpc-java',
    ':interop',
    ':testing',
    ':netty',
    '//third_party/java/junit',
    '//third_party/java/okhttp',
  ],
  tags = [
    'manual',
  ],
  runtime_deps = [
    '//third_party/java/hamcrest',
  ]
)
