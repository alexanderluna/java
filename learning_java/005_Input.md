# Input and Output

Java's IO is built upon streams. All streams behave equally and thus
implementing them is standarized.

There are 2 types of streams:

- byte: handle IO of bytes as in binary data
- character: handle IO of characters using unicode

The byte stream class is built upon the InputStream and OutputStream classes.
The character stream is build upon the Reader and Writer classes. Both byte and
character streams work the same way.

To read and write to files we use byte streams. We can use the FileInputStream
and FileOutputStream to create a byte stream linked to a file.

Each time we open a stream we have to also close it. However, using the
try-with-resources statement we can also automatically close a file.

```java
try(resourceSpecification) {
} (FileInputStream fin = new FileInputStream(args[0]));
```

To use this statement a resource must implement the AutoClosable interface. It
is possible to manage more than 1 resource with this statement as well.
