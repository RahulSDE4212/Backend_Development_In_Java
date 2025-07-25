java_binary (
    srcs = ["HelloWorld.java"],
    main_class = "main.java.com.algocamp.project.HelloWorld",
    name = "hello_world",
    # runtime_deps = [
    #     ":util_lib",
    # ],

    deps = [
        ":util_lib",
    ],
)

java_library(
    name = "util_lib",
    srcs = glob(["util/*.java"]),
    visibility = ["//visibility:public"],
)