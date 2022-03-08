protected val nextunnelBoardsSQL = Seq(
    "switch-polaris",
    "wired-arm64",
    "wired-arm-qca",
    "x86-gen2",
    "test"
).map(b => s"'$b'").mkString(",")