---
name: Bug Report
about: 报告代码中的缺陷
title: "[BUG]"
labels: bug
assignees: ''

---

**问题描述**  
清晰描述缺陷的现象及影响。

**复现步骤**  
1. 调用方法：`StringUtils.abbreviate("Test", -3)`  
2. 观察返回结果。

**预期行为**  
应抛出 `IllegalArgumentException` 异常。

**实际行为**  
返回空字符串。

**环境信息**  
- 项目版本：1.0.0  
- Java版本：JDK 17  
- 依赖库：commons-lang3 3.12.0

**附加信息**  
关联的代码文件：`src/main/java/org/apache/commons/lang3/StringUtils.java`
