mkdir -p /tmp/sbah
rm -rf /tmp/sbah
mkdir -p /tmp/sbah

cat << 'EOF' > /tmp/sbah/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
EOF

javac /tmp/sbah/Main.java
