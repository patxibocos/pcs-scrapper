// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/riders.proto

package io.github.patxibocos.pcsscraper.protobuf.rider;

public final class RidersOuterClass {
  private RidersOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RidersOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.github.patxibocos.pcsscraper.protobuf.rider.Riders)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> 
        getRidersList();
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider getRiders(int index);
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    int getRidersCount();
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    java.util.List<? extends io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder> 
        getRidersOrBuilderList();
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder getRidersOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code io.github.patxibocos.pcsscraper.protobuf.rider.Riders}
   */
  public static final class Riders extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.github.patxibocos.pcsscraper.protobuf.rider.Riders)
      RidersOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Riders.newBuilder() to construct.
    private Riders(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Riders() {
      riders_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Riders();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Riders(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                riders_ = new java.util.ArrayList<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider>();
                mutable_bitField0_ |= 0x00000001;
              }
              riders_.add(
                  input.readMessage(io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          riders_ = java.util.Collections.unmodifiableList(riders_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.class, io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.Builder.class);
    }

    public static final int RIDERS_FIELD_NUMBER = 1;
    private java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> riders_;
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    @java.lang.Override
    public java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> getRidersList() {
      return riders_;
    }
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder> 
        getRidersOrBuilderList() {
      return riders_;
    }
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    @java.lang.Override
    public int getRidersCount() {
      return riders_.size();
    }
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    @java.lang.Override
    public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider getRiders(int index) {
      return riders_.get(index);
    }
    /**
     * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
     */
    @java.lang.Override
    public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder getRidersOrBuilder(
        int index) {
      return riders_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < riders_.size(); i++) {
        output.writeMessage(1, riders_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < riders_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, riders_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders)) {
        return super.equals(obj);
      }
      io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders other = (io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders) obj;

      if (!getRidersList()
          .equals(other.getRidersList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getRidersCount() > 0) {
        hash = (37 * hash) + RIDERS_FIELD_NUMBER;
        hash = (53 * hash) + getRidersList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code io.github.patxibocos.pcsscraper.protobuf.rider.Riders}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.github.patxibocos.pcsscraper.protobuf.rider.Riders)
        io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.RidersOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.class, io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.Builder.class);
      }

      // Construct using io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRidersFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (ridersBuilder_ == null) {
          riders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ridersBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor;
      }

      @java.lang.Override
      public io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders getDefaultInstanceForType() {
        return io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.getDefaultInstance();
      }

      @java.lang.Override
      public io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders build() {
        io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders buildPartial() {
        io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders result = new io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders(this);
        int from_bitField0_ = bitField0_;
        if (ridersBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            riders_ = java.util.Collections.unmodifiableList(riders_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.riders_ = riders_;
        } else {
          result.riders_ = ridersBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders) {
          return mergeFrom((io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders other) {
        if (other == io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders.getDefaultInstance()) return this;
        if (ridersBuilder_ == null) {
          if (!other.riders_.isEmpty()) {
            if (riders_.isEmpty()) {
              riders_ = other.riders_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRidersIsMutable();
              riders_.addAll(other.riders_);
            }
            onChanged();
          }
        } else {
          if (!other.riders_.isEmpty()) {
            if (ridersBuilder_.isEmpty()) {
              ridersBuilder_.dispose();
              ridersBuilder_ = null;
              riders_ = other.riders_;
              bitField0_ = (bitField0_ & ~0x00000001);
              ridersBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRidersFieldBuilder() : null;
            } else {
              ridersBuilder_.addAllMessages(other.riders_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> riders_ =
        java.util.Collections.emptyList();
      private void ensureRidersIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          riders_ = new java.util.ArrayList<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider>(riders_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder> ridersBuilder_;

      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> getRidersList() {
        if (ridersBuilder_ == null) {
          return java.util.Collections.unmodifiableList(riders_);
        } else {
          return ridersBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public int getRidersCount() {
        if (ridersBuilder_ == null) {
          return riders_.size();
        } else {
          return ridersBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider getRiders(int index) {
        if (ridersBuilder_ == null) {
          return riders_.get(index);
        } else {
          return ridersBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder setRiders(
          int index, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider value) {
        if (ridersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRidersIsMutable();
          riders_.set(index, value);
          onChanged();
        } else {
          ridersBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder setRiders(
          int index, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder builderForValue) {
        if (ridersBuilder_ == null) {
          ensureRidersIsMutable();
          riders_.set(index, builderForValue.build());
          onChanged();
        } else {
          ridersBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder addRiders(io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider value) {
        if (ridersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRidersIsMutable();
          riders_.add(value);
          onChanged();
        } else {
          ridersBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder addRiders(
          int index, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider value) {
        if (ridersBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRidersIsMutable();
          riders_.add(index, value);
          onChanged();
        } else {
          ridersBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder addRiders(
          io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder builderForValue) {
        if (ridersBuilder_ == null) {
          ensureRidersIsMutable();
          riders_.add(builderForValue.build());
          onChanged();
        } else {
          ridersBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder addRiders(
          int index, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder builderForValue) {
        if (ridersBuilder_ == null) {
          ensureRidersIsMutable();
          riders_.add(index, builderForValue.build());
          onChanged();
        } else {
          ridersBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder addAllRiders(
          java.lang.Iterable<? extends io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider> values) {
        if (ridersBuilder_ == null) {
          ensureRidersIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, riders_);
          onChanged();
        } else {
          ridersBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder clearRiders() {
        if (ridersBuilder_ == null) {
          riders_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          ridersBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public Builder removeRiders(int index) {
        if (ridersBuilder_ == null) {
          ensureRidersIsMutable();
          riders_.remove(index);
          onChanged();
        } else {
          ridersBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder getRidersBuilder(
          int index) {
        return getRidersFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder getRidersOrBuilder(
          int index) {
        if (ridersBuilder_ == null) {
          return riders_.get(index);  } else {
          return ridersBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public java.util.List<? extends io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder> 
           getRidersOrBuilderList() {
        if (ridersBuilder_ != null) {
          return ridersBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(riders_);
        }
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder addRidersBuilder() {
        return getRidersFieldBuilder().addBuilder(
            io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.getDefaultInstance());
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder addRidersBuilder(
          int index) {
        return getRidersFieldBuilder().addBuilder(
            index, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.getDefaultInstance());
      }
      /**
       * <code>repeated .io.github.patxibocos.pcsscraper.protobuf.rider.Rider riders = 1;</code>
       */
      public java.util.List<io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder> 
           getRidersBuilderList() {
        return getRidersFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder> 
          getRidersFieldBuilder() {
        if (ridersBuilder_ == null) {
          ridersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.Rider.Builder, io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.RiderOrBuilder>(
                  riders_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          riders_ = null;
        }
        return ridersBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:io.github.patxibocos.pcsscraper.protobuf.rider.Riders)
    }

    // @@protoc_insertion_point(class_scope:io.github.patxibocos.pcsscraper.protobuf.rider.Riders)
    private static final io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders();
    }

    public static io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Riders>
        PARSER = new com.google.protobuf.AbstractParser<Riders>() {
      @java.lang.Override
      public Riders parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Riders(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Riders> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Riders> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.github.patxibocos.pcsscraper.protobuf.rider.RidersOuterClass.Riders getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033src/main/proto/riders.proto\022.io.github" +
      ".patxibocos.pcsscraper.protobuf.rider\032\032s" +
      "rc/main/proto/rider.proto\"O\n\006Riders\022E\n\006r" +
      "iders\030\001 \003(\01325.io.github.patxibocos.pcssc" +
      "raper.protobuf.rider.Riderb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.getDescriptor(),
        });
    internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_github_patxibocos_pcsscraper_protobuf_rider_Riders_descriptor,
        new java.lang.String[] { "Riders", });
    io.github.patxibocos.pcsscraper.protobuf.rider.RiderOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
