// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class RogueMiracleOuterClass {
  /**
   * Protobuf type {@code RogueMiracle}
   */
  public static final class RogueMiracle extends ProtoMessage<RogueMiracle> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <pre>
     *  4 12
     * </pre>
     *
     * <code>optional uint32 use_count = 1;</code>
     */
    private int useCount;

    /**
     * <pre>
     *  1 12
     * </pre>
     *
     * <code>optional uint32 total_count = 4;</code>
     */
    private int totalCount;

    /**
     * <pre>
     *  1 4
     * </pre>
     *
     * <code>optional uint32 miracle_id = 12;</code>
     */
    private int miracleId;

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     */
    private final RepeatedMessage<EffectCountEntry> effectCount = RepeatedMessage.newEmptyInstance(EffectCountEntry.getFactory());

    private RogueMiracle() {
    }

    /**
     * @return a new empty instance of {@code RogueMiracle}
     */
    public static RogueMiracle newInstance() {
      return new RogueMiracle();
    }

    /**
     * <pre>
     *  4 12
     * </pre>
     *
     * <code>optional uint32 use_count = 1;</code>
     * @return whether the useCount field is set
     */
    public boolean hasUseCount() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <pre>
     *  4 12
     * </pre>
     *
     * <code>optional uint32 use_count = 1;</code>
     * @return this
     */
    public RogueMiracle clearUseCount() {
      bitField0_ &= ~0x00000001;
      useCount = 0;
      return this;
    }

    /**
     * <pre>
     *  4 12
     * </pre>
     *
     * <code>optional uint32 use_count = 1;</code>
     * @return the useCount
     */
    public int getUseCount() {
      return useCount;
    }

    /**
     * <pre>
     *  4 12
     * </pre>
     *
     * <code>optional uint32 use_count = 1;</code>
     * @param value the useCount to set
     * @return this
     */
    public RogueMiracle setUseCount(final int value) {
      bitField0_ |= 0x00000001;
      useCount = value;
      return this;
    }

    /**
     * <pre>
     *  1 12
     * </pre>
     *
     * <code>optional uint32 total_count = 4;</code>
     * @return whether the totalCount field is set
     */
    public boolean hasTotalCount() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <pre>
     *  1 12
     * </pre>
     *
     * <code>optional uint32 total_count = 4;</code>
     * @return this
     */
    public RogueMiracle clearTotalCount() {
      bitField0_ &= ~0x00000002;
      totalCount = 0;
      return this;
    }

    /**
     * <pre>
     *  1 12
     * </pre>
     *
     * <code>optional uint32 total_count = 4;</code>
     * @return the totalCount
     */
    public int getTotalCount() {
      return totalCount;
    }

    /**
     * <pre>
     *  1 12
     * </pre>
     *
     * <code>optional uint32 total_count = 4;</code>
     * @param value the totalCount to set
     * @return this
     */
    public RogueMiracle setTotalCount(final int value) {
      bitField0_ |= 0x00000002;
      totalCount = value;
      return this;
    }

    /**
     * <pre>
     *  1 4
     * </pre>
     *
     * <code>optional uint32 miracle_id = 12;</code>
     * @return whether the miracleId field is set
     */
    public boolean hasMiracleId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <pre>
     *  1 4
     * </pre>
     *
     * <code>optional uint32 miracle_id = 12;</code>
     * @return this
     */
    public RogueMiracle clearMiracleId() {
      bitField0_ &= ~0x00000004;
      miracleId = 0;
      return this;
    }

    /**
     * <pre>
     *  1 4
     * </pre>
     *
     * <code>optional uint32 miracle_id = 12;</code>
     * @return the miracleId
     */
    public int getMiracleId() {
      return miracleId;
    }

    /**
     * <pre>
     *  1 4
     * </pre>
     *
     * <code>optional uint32 miracle_id = 12;</code>
     * @param value the miracleId to set
     * @return this
     */
    public RogueMiracle setMiracleId(final int value) {
      bitField0_ |= 0x00000004;
      miracleId = value;
      return this;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     * @return whether the effectCount field is set
     */
    public boolean hasEffectCount() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     * @return this
     */
    public RogueMiracle clearEffectCount() {
      bitField0_ &= ~0x00000008;
      effectCount.clear();
      return this;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableEffectCount()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<EffectCountEntry> getEffectCount() {
      return effectCount;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<EffectCountEntry> getMutableEffectCount() {
      bitField0_ |= 0x00000008;
      return effectCount;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     * @param value the effectCount to add
     * @return this
     */
    public RogueMiracle addEffectCount(final EffectCountEntry value) {
      bitField0_ |= 0x00000008;
      effectCount.add(value);
      return this;
    }

    /**
     * <code>repeated .RogueMiracle.EffectCountEntry effect_count = 10;</code>
     * @param values the effectCount to add
     * @return this
     */
    public RogueMiracle addAllEffectCount(final EffectCountEntry... values) {
      bitField0_ |= 0x00000008;
      effectCount.addAll(values);
      return this;
    }

    @Override
    public RogueMiracle copyFrom(final RogueMiracle other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        useCount = other.useCount;
        totalCount = other.totalCount;
        miracleId = other.miracleId;
        effectCount.copyFrom(other.effectCount);
      }
      return this;
    }

    @Override
    public RogueMiracle mergeFrom(final RogueMiracle other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasUseCount()) {
        setUseCount(other.useCount);
      }
      if (other.hasTotalCount()) {
        setTotalCount(other.totalCount);
      }
      if (other.hasMiracleId()) {
        setMiracleId(other.miracleId);
      }
      if (other.hasEffectCount()) {
        getMutableEffectCount().addAll(other.effectCount);
      }
      return this;
    }

    @Override
    public RogueMiracle clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      useCount = 0;
      totalCount = 0;
      miracleId = 0;
      effectCount.clear();
      return this;
    }

    @Override
    public RogueMiracle clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      effectCount.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof RogueMiracle)) {
        return false;
      }
      RogueMiracle other = (RogueMiracle) o;
      return bitField0_ == other.bitField0_
        && (!hasUseCount() || useCount == other.useCount)
        && (!hasTotalCount() || totalCount == other.totalCount)
        && (!hasMiracleId() || miracleId == other.miracleId)
        && (!hasEffectCount() || effectCount.equals(other.effectCount));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(useCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(totalCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(miracleId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < effectCount.length(); i++) {
          output.writeRawByte((byte) 82);
          output.writeMessageNoTag(effectCount.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(useCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(totalCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(miracleId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * effectCount.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(effectCount);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public RogueMiracle mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // useCount
            useCount = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // totalCount
            totalCount = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // miracleId
            miracleId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 82) {
              break;
            }
          }
          case 82: {
            // effectCount
            tag = input.readRepeatedMessage(effectCount, tag);
            bitField0_ |= 0x00000008;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.useCount, useCount);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.totalCount, totalCount);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.miracleId, miracleId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.effectCount, effectCount);
      }
      output.endObject();
    }

    @Override
    public RogueMiracle mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -309069880:
          case -200869801: {
            if (input.isAtField(FieldNames.useCount)) {
              if (!input.trySkipNullValue()) {
                useCount = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -731385813:
          case -407761836: {
            if (input.isAtField(FieldNames.totalCount)) {
              if (!input.trySkipNullValue()) {
                totalCount = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -164571796:
          case -806736983: {
            if (input.isAtField(FieldNames.miracleId)) {
              if (!input.trySkipNullValue()) {
                miracleId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1635252734:
          case -56410911: {
            if (input.isAtField(FieldNames.effectCount)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(effectCount);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public RogueMiracle clone() {
      return new RogueMiracle().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static RogueMiracle parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new RogueMiracle(), data).checkInitialized();
    }

    public static RogueMiracle parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracle(), input).checkInitialized();
    }

    public static RogueMiracle parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new RogueMiracle(), input).checkInitialized();
    }

    /**
     * @return factory for creating RogueMiracle messages
     */
    public static MessageFactory<RogueMiracle> getFactory() {
      return RogueMiracleFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code EffectCountEntry}
     */
    public static final class EffectCountEntry extends ProtoMessage<EffectCountEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional uint32 key = 1;</code>
       */
      private int key;

      /**
       * <code>optional uint32 value = 2;</code>
       */
      private int value_;

      private EffectCountEntry() {
      }

      /**
       * @return a new empty instance of {@code EffectCountEntry}
       */
      public static EffectCountEntry newInstance() {
        return new EffectCountEntry();
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return this
       */
      public EffectCountEntry clearKey() {
        bitField0_ &= ~0x00000001;
        key = 0;
        return this;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @return the key
       */
      public int getKey() {
        return key;
      }

      /**
       * <code>optional uint32 key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public EffectCountEntry setKey(final int value) {
        bitField0_ |= 0x00000001;
        key = value;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return this
       */
      public EffectCountEntry clearValue() {
        bitField0_ &= ~0x00000002;
        value_ = 0;
        return this;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @return the value_
       */
      public int getValue() {
        return value_;
      }

      /**
       * <code>optional uint32 value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public EffectCountEntry setValue(final int value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        return this;
      }

      @Override
      public EffectCountEntry copyFrom(final EffectCountEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          key = other.key;
          value_ = other.value_;
        }
        return this;
      }

      @Override
      public EffectCountEntry mergeFrom(final EffectCountEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasKey()) {
          setKey(other.key);
        }
        if (other.hasValue()) {
          setValue(other.value_);
        }
        return this;
      }

      @Override
      public EffectCountEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key = 0;
        value_ = 0;
        return this;
      }

      @Override
      public EffectCountEntry clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof EffectCountEntry)) {
          return false;
        }
        EffectCountEntry other = (EffectCountEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasKey() || key == other.key)
          && (!hasValue() || value_ == other.value_);
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 16);
          output.writeUInt32NoTag(value_);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeUInt32SizeNoTag(value_);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public EffectCountEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 8: {
              // key
              key = input.readUInt32();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 16) {
                break;
              }
            }
            case 16: {
              // value_
              value_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeUInt32(FieldNames.key, key);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeUInt32(FieldNames.value_, value_);
        }
        output.endObject();
      }

      @Override
      public EffectCountEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  key = input.readUInt32();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readUInt32();
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public EffectCountEntry clone() {
        return new EffectCountEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static EffectCountEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new EffectCountEntry(), data).checkInitialized();
      }

      public static EffectCountEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new EffectCountEntry(), input).checkInitialized();
      }

      public static EffectCountEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new EffectCountEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating EffectCountEntry messages
       */
      public static MessageFactory<EffectCountEntry> getFactory() {
        return EffectCountEntryFactory.INSTANCE;
      }

      private enum EffectCountEntryFactory implements MessageFactory<EffectCountEntry> {
        INSTANCE;

        @Override
        public EffectCountEntry create() {
          return EffectCountEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName key = FieldName.forField("key");

        static final FieldName value_ = FieldName.forField("value");
      }
    }

    private enum RogueMiracleFactory implements MessageFactory<RogueMiracle> {
      INSTANCE;

      @Override
      public RogueMiracle create() {
        return RogueMiracle.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName useCount = FieldName.forField("useCount", "use_count");

      static final FieldName totalCount = FieldName.forField("totalCount", "total_count");

      static final FieldName miracleId = FieldName.forField("miracleId", "miracle_id");

      static final FieldName effectCount = FieldName.forField("effectCount", "effect_count");
    }
  }
}
