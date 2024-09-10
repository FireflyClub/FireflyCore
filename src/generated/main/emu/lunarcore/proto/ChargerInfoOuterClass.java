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

public final class ChargerInfoOuterClass {
  /**
   * Protobuf type {@code ChargerInfo}
   */
  public static final class ChargerInfo extends ProtoMessage<ChargerInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 rotate_int = 8;</code>
     */
    private int rotateInt;

    /**
     * <code>optional uint32 group_id = 9;</code>
     */
    private int groupId;

    private ChargerInfo() {
    }

    /**
     * @return a new empty instance of {@code ChargerInfo}
     */
    public static ChargerInfo newInstance() {
      return new ChargerInfo();
    }

    /**
     * <code>optional uint32 rotate_int = 8;</code>
     * @return whether the rotateInt field is set
     */
    public boolean hasRotateInt() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 rotate_int = 8;</code>
     * @return this
     */
    public ChargerInfo clearRotateInt() {
      bitField0_ &= ~0x00000001;
      rotateInt = 0;
      return this;
    }

    /**
     * <code>optional uint32 rotate_int = 8;</code>
     * @return the rotateInt
     */
    public int getRotateInt() {
      return rotateInt;
    }

    /**
     * <code>optional uint32 rotate_int = 8;</code>
     * @param value the rotateInt to set
     * @return this
     */
    public ChargerInfo setRotateInt(final int value) {
      bitField0_ |= 0x00000001;
      rotateInt = value;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return this
     */
    public ChargerInfo clearGroupId() {
      bitField0_ &= ~0x00000002;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 9;</code>
     * @param value the groupId to set
     * @return this
     */
    public ChargerInfo setGroupId(final int value) {
      bitField0_ |= 0x00000002;
      groupId = value;
      return this;
    }

    @Override
    public ChargerInfo copyFrom(final ChargerInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rotateInt = other.rotateInt;
        groupId = other.groupId;
      }
      return this;
    }

    @Override
    public ChargerInfo mergeFrom(final ChargerInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRotateInt()) {
        setRotateInt(other.rotateInt);
      }
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      return this;
    }

    @Override
    public ChargerInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rotateInt = 0;
      groupId = 0;
      return this;
    }

    @Override
    public ChargerInfo clearQuick() {
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
      if (!(o instanceof ChargerInfo)) {
        return false;
      }
      ChargerInfo other = (ChargerInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRotateInt() || rotateInt == other.rotateInt)
        && (!hasGroupId() || groupId == other.groupId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(rotateInt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 72);
        output.writeUInt32NoTag(groupId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(rotateInt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ChargerInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // rotateInt
            rotateInt = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 72) {
              break;
            }
          }
          case 72: {
            // groupId
            groupId = input.readUInt32();
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
        output.writeUInt32(FieldNames.rotateInt, rotateInt);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      output.endObject();
    }

    @Override
    public ChargerInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1249476460:
          case -78414069: {
            if (input.isAtField(FieldNames.rotateInt)) {
              if (!input.trySkipNullValue()) {
                rotateInt = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
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
    public ChargerInfo clone() {
      return new ChargerInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ChargerInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ChargerInfo(), data).checkInitialized();
    }

    public static ChargerInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChargerInfo(), input).checkInitialized();
    }

    public static ChargerInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ChargerInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating ChargerInfo messages
     */
    public static MessageFactory<ChargerInfo> getFactory() {
      return ChargerInfoFactory.INSTANCE;
    }

    private enum ChargerInfoFactory implements MessageFactory<ChargerInfo> {
      INSTANCE;

      @Override
      public ChargerInfo create() {
        return ChargerInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rotateInt = FieldName.forField("rotateInt", "rotate_int");

      static final FieldName groupId = FieldName.forField("groupId", "group_id");
    }
  }
}
