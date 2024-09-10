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

public final class MaterialOuterClass {
  /**
   * Protobuf type {@code Material}
   */
  public static final class Material extends ProtoMessage<Material> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 expire_time = 6;</code>
     */
    private long expireTime;

    /**
     * <code>optional uint32 num = 10;</code>
     */
    private int num;

    /**
     * <code>optional uint32 tid = 15;</code>
     */
    private int tid;

    private Material() {
    }

    /**
     * @return a new empty instance of {@code Material}
     */
    public static Material newInstance() {
      return new Material();
    }

    /**
     * <code>optional uint64 expire_time = 6;</code>
     * @return whether the expireTime field is set
     */
    public boolean hasExpireTime() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 expire_time = 6;</code>
     * @return this
     */
    public Material clearExpireTime() {
      bitField0_ &= ~0x00000001;
      expireTime = 0L;
      return this;
    }

    /**
     * <code>optional uint64 expire_time = 6;</code>
     * @return the expireTime
     */
    public long getExpireTime() {
      return expireTime;
    }

    /**
     * <code>optional uint64 expire_time = 6;</code>
     * @param value the expireTime to set
     * @return this
     */
    public Material setExpireTime(final long value) {
      bitField0_ |= 0x00000001;
      expireTime = value;
      return this;
    }

    /**
     * <code>optional uint32 num = 10;</code>
     * @return whether the num field is set
     */
    public boolean hasNum() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 num = 10;</code>
     * @return this
     */
    public Material clearNum() {
      bitField0_ &= ~0x00000002;
      num = 0;
      return this;
    }

    /**
     * <code>optional uint32 num = 10;</code>
     * @return the num
     */
    public int getNum() {
      return num;
    }

    /**
     * <code>optional uint32 num = 10;</code>
     * @param value the num to set
     * @return this
     */
    public Material setNum(final int value) {
      bitField0_ |= 0x00000002;
      num = value;
      return this;
    }

    /**
     * <code>optional uint32 tid = 15;</code>
     * @return whether the tid field is set
     */
    public boolean hasTid() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 tid = 15;</code>
     * @return this
     */
    public Material clearTid() {
      bitField0_ &= ~0x00000004;
      tid = 0;
      return this;
    }

    /**
     * <code>optional uint32 tid = 15;</code>
     * @return the tid
     */
    public int getTid() {
      return tid;
    }

    /**
     * <code>optional uint32 tid = 15;</code>
     * @param value the tid to set
     * @return this
     */
    public Material setTid(final int value) {
      bitField0_ |= 0x00000004;
      tid = value;
      return this;
    }

    @Override
    public Material copyFrom(final Material other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        expireTime = other.expireTime;
        num = other.num;
        tid = other.tid;
      }
      return this;
    }

    @Override
    public Material mergeFrom(final Material other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasExpireTime()) {
        setExpireTime(other.expireTime);
      }
      if (other.hasNum()) {
        setNum(other.num);
      }
      if (other.hasTid()) {
        setTid(other.tid);
      }
      return this;
    }

    @Override
    public Material clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      expireTime = 0L;
      num = 0;
      tid = 0;
      return this;
    }

    @Override
    public Material clearQuick() {
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
      if (!(o instanceof Material)) {
        return false;
      }
      Material other = (Material) o;
      return bitField0_ == other.bitField0_
        && (!hasExpireTime() || expireTime == other.expireTime)
        && (!hasNum() || num == other.num)
        && (!hasTid() || tid == other.tid);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt64NoTag(expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(num);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 120);
        output.writeUInt32NoTag(tid);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(num);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(tid);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public Material mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 48: {
            // expireTime
            expireTime = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // num
            num = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 120) {
              break;
            }
          }
          case 120: {
            // tid
            tid = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeUInt64(FieldNames.expireTime, expireTime);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.num, num);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.tid, tid);
      }
      output.endObject();
    }

    @Override
    public Material mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -834724724:
          case -96179731: {
            if (input.isAtField(FieldNames.expireTime)) {
              if (!input.trySkipNullValue()) {
                expireTime = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109446: {
            if (input.isAtField(FieldNames.num)) {
              if (!input.trySkipNullValue()) {
                num = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 114831: {
            if (input.isAtField(FieldNames.tid)) {
              if (!input.trySkipNullValue()) {
                tid = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public Material clone() {
      return new Material().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static Material parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new Material(), data).checkInitialized();
    }

    public static Material parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Material(), input).checkInitialized();
    }

    public static Material parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new Material(), input).checkInitialized();
    }

    /**
     * @return factory for creating Material messages
     */
    public static MessageFactory<Material> getFactory() {
      return MaterialFactory.INSTANCE;
    }

    private enum MaterialFactory implements MessageFactory<Material> {
      INSTANCE;

      @Override
      public Material create() {
        return Material.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName expireTime = FieldName.forField("expireTime", "expire_time");

      static final FieldName num = FieldName.forField("num");

      static final FieldName tid = FieldName.forField("tid");
    }
  }
}
