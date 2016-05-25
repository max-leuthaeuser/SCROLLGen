SCROLLGen
=========
Code generation from CROM models to the *SCala ROLes Language*.

**Usage:**

```
java -jar SCROLLGen.jar --in <file> --out <file>

 --in <file>
   The .ecore model that should be used for code generation

 --out <folder-path>
   The path to the folder where the generated .scala file should be located at
```

To get the jar run ```sbt core/assembly``` which stores it in ```core/target/scala-2.11/```.

**Supported features (correct generation of):**
* Data-Types
* Natural-Types
* Role-Types
* Compartment-Types
* Fulfillments
* Relationsships
* Role-Constraints (Riehle)
* Role-Groups
