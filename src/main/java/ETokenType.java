public enum ETokenType {
    None,
    Not,
    Number,
    String,
    Plus,
    Minus,
    Multiply,
    Divide,
    Equiv,
    NotEquiv,
    Assert,
    Print,
    Quit,
    Resume,
    Suspend,
    Replace,
    Get,
    Store,
    Ident,
    Whitespace,
    True,
    False,

    Dup,
    Swap,
    Rot,
    RotN,
    Drop,

    Erase,
    Exists,

    OpenSquareBracket,
    CloseSquareBracket,

    OpenParan,
    CloseParan,

    OpenBrace,
    CloseBrace,

    Break,
    Exit,
    Dump,
    Modulo,
    Comment,
    Depth, Clear, QuotedIdent, If, IfElse, While, For,
    Less, Greater, LessEqual, GreaterEqual,
}