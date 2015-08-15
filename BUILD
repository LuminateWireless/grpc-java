package(default_visibility = ['//visibility:public'])

licenses(['notice'])

cc_binary(
  name = 'grpc_java_plugin',
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
    '//external:google-auth-library-credentials',
    '//external:google-auth-library-oauth2-http',
    '//third_party/java/guava',
    '//external:jsr305',
  ],
  exports = [
    '//external:google-auth-library-oauth2-http',
  ]
)

java_library(
  name = 'core',
  srcs = glob([
    'core/src/main/java/**/*.java'
  ]),
  deps = [
    '//third_party/java/guava',
    '//external:jsr305',
  ],
)

java_library(
  name = 'netty',
  srcs = glob([
    'netty/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//external:jsr305',
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
    '//external:jsr305',
  ],
)

java_library(
  name = 'okhttp',
  srcs = glob([
    'okhttp/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//external:jsr305',
    '//external:okhttp',
    '//external:okio',
  ],
  exports = [
    '//external:okhttp',
  ]
)

java_library(
  name = 'stub',
  srcs = glob([
    'stub/src/main/java/**/*.java'
  ]),
  deps = [
    ':core',
    '//third_party/java/guava',
    '//external:jsr305',
  ],
)

java_library(
  name = 'grpc-java',
  exports = [
    ':auth',
    ':core',
    ':okhttp',
    ':protobuf',
    ':stub',
    '//external:jsr305',
    '//third_party/java/guava',
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
    '//external:junit',
    '//external:mockito',
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
    '//external:junit',
    '//external:mockito',
  ],
  args = [
    'io.grpc.stub.StubConfigTest'
  ],
  tags = [
    'manual',
  ],
  runtime_deps = [
    '//external:hamcrest'
  ]
)
