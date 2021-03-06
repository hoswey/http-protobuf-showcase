// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echo.proto

package com.hoswey.showcase.protobuf;

public final class Echo {
  private Echo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface TextOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.hoswey.showcase.protobuf.Text)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string message = 1;</code>
     */
    boolean hasMessage();
    /**
     * <code>required string message = 1;</code>
     */
    java.lang.String getMessage();
    /**
     * <code>required string message = 1;</code>
     */
    com.google.protobuf.ByteString
        getMessageBytes();

    /**
     * <code>required string body = 2;</code>
     */
    boolean hasBody();
    /**
     * <code>required string body = 2;</code>
     */
    java.lang.String getBody();
    /**
     * <code>required string body = 2;</code>
     */
    com.google.protobuf.ByteString
        getBodyBytes();
  }
  /**
   * Protobuf type {@code com.hoswey.showcase.protobuf.Text}
   */
  public static final class Text extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.hoswey.showcase.protobuf.Text)
      TextOrBuilder {
    // Use Text.newBuilder() to construct.
    private Text(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Text(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Text defaultInstance;
    public static Text getDefaultInstance() {
      return defaultInstance;
    }

    public Text getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Text(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              message_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              body_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hoswey.showcase.protobuf.Echo.internal_static_com_hoswey_showcase_protobuf_Text_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hoswey.showcase.protobuf.Echo.internal_static_com_hoswey_showcase_protobuf_Text_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hoswey.showcase.protobuf.Echo.Text.class, com.hoswey.showcase.protobuf.Echo.Text.Builder.class);
    }

    public static com.google.protobuf.Parser<Text> PARSER =
        new com.google.protobuf.AbstractParser<Text>() {
      public Text parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Text(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Text> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    /**
     * <code>required string message = 1;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string message = 1;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string message = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int BODY_FIELD_NUMBER = 2;
    private java.lang.Object body_;
    /**
     * <code>required string body = 2;</code>
     */
    public boolean hasBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string body = 2;</code>
     */
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          body_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string body = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      message_ = "";
      body_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasBody()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getBodyBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMessageBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getBodyBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.hoswey.showcase.protobuf.Echo.Text parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.hoswey.showcase.protobuf.Echo.Text prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.hoswey.showcase.protobuf.Text}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.hoswey.showcase.protobuf.Text)
        com.hoswey.showcase.protobuf.Echo.TextOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.hoswey.showcase.protobuf.Echo.internal_static_com_hoswey_showcase_protobuf_Text_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.hoswey.showcase.protobuf.Echo.internal_static_com_hoswey_showcase_protobuf_Text_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.hoswey.showcase.protobuf.Echo.Text.class, com.hoswey.showcase.protobuf.Echo.Text.Builder.class);
      }

      // Construct using com.hoswey.showcase.protobuf.Echo.Text.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        body_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.hoswey.showcase.protobuf.Echo.internal_static_com_hoswey_showcase_protobuf_Text_descriptor;
      }

      public com.hoswey.showcase.protobuf.Echo.Text getDefaultInstanceForType() {
        return com.hoswey.showcase.protobuf.Echo.Text.getDefaultInstance();
      }

      public com.hoswey.showcase.protobuf.Echo.Text build() {
        com.hoswey.showcase.protobuf.Echo.Text result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.hoswey.showcase.protobuf.Echo.Text buildPartial() {
        com.hoswey.showcase.protobuf.Echo.Text result = new com.hoswey.showcase.protobuf.Echo.Text(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.body_ = body_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.hoswey.showcase.protobuf.Echo.Text) {
          return mergeFrom((com.hoswey.showcase.protobuf.Echo.Text)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.hoswey.showcase.protobuf.Echo.Text other) {
        if (other == com.hoswey.showcase.protobuf.Echo.Text.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          bitField0_ |= 0x00000001;
          message_ = other.message_;
          onChanged();
        }
        if (other.hasBody()) {
          bitField0_ |= 0x00000002;
          body_ = other.body_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        if (!hasBody()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.hoswey.showcase.protobuf.Echo.Text parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.hoswey.showcase.protobuf.Echo.Text) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object message_ = "";
      /**
       * <code>required string message = 1;</code>
       */
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string message = 1;</code>
       */
      public java.lang.String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            message_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public com.google.protobuf.ByteString
          getMessageBytes() {
        java.lang.Object ref = message_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          message_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      /**
       * <code>required string message = 1;</code>
       */
      public Builder setMessageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object body_ = "";
      /**
       * <code>required string body = 2;</code>
       */
      public boolean hasBody() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string body = 2;</code>
       */
      public java.lang.String getBody() {
        java.lang.Object ref = body_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            body_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string body = 2;</code>
       */
      public com.google.protobuf.ByteString
          getBodyBytes() {
        java.lang.Object ref = body_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          body_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string body = 2;</code>
       */
      public Builder setBody(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string body = 2;</code>
       */
      public Builder clearBody() {
        bitField0_ = (bitField0_ & ~0x00000002);
        body_ = getDefaultInstance().getBody();
        onChanged();
        return this;
      }
      /**
       * <code>required string body = 2;</code>
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        body_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.hoswey.showcase.protobuf.Text)
    }

    static {
      defaultInstance = new Text(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.hoswey.showcase.protobuf.Text)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hoswey_showcase_protobuf_Text_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hoswey_showcase_protobuf_Text_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\necho.proto\022\034com.hoswey.showcase.protob" +
      "uf\"%\n\004Text\022\017\n\007message\030\001 \002(\t\022\014\n\004body\030\002 \002(" +
      "\tB$\n\034com.hoswey.showcase.protobufB\004Echo"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_hoswey_showcase_protobuf_Text_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hoswey_showcase_protobuf_Text_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hoswey_showcase_protobuf_Text_descriptor,
        new java.lang.String[] { "Message", "Body", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
