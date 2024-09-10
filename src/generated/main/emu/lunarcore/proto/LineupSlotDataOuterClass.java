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

public final class LineupSlotDataOuterClass {
  /**
   * Protobuf type {@code LineupSlotData}
   */
  public static final class LineupSlotData extends ProtoMessage<LineupSlotData> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 3;</code>
     */
    private int id;

    /**
     * <code>optional uint32 slot_type = 13;</code>
     */
    private int slotType;

    /**
     * <code>optional .AvatarType avatar_type = 10;</code>
     */
    private int avatarType;

    private LineupSlotData() {
    }

    /**
     * @return a new empty instance of {@code LineupSlotData}
     */
    public static LineupSlotData newInstance() {
      return new LineupSlotData();
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return this
     */
    public LineupSlotData clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 3;</code>
     * @param value the id to set
     * @return this
     */
    public LineupSlotData setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <code>optional uint32 slot_type = 13;</code>
     * @return whether the slotType field is set
     */
    public boolean hasSlotType() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 slot_type = 13;</code>
     * @return this
     */
    public LineupSlotData clearSlotType() {
      bitField0_ &= ~0x00000002;
      slotType = 0;
      return this;
    }

    /**
     * <code>optional uint32 slot_type = 13;</code>
     * @return the slotType
     */
    public int getSlotType() {
      return slotType;
    }

    /**
     * <code>optional uint32 slot_type = 13;</code>
     * @param value the slotType to set
     * @return this
     */
    public LineupSlotData setSlotType(final int value) {
      bitField0_ |= 0x00000002;
      slotType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 10;</code>
     * @return whether the avatarType field is set
     */
    public boolean hasAvatarType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .AvatarType avatar_type = 10;</code>
     * @return this
     */
    public LineupSlotData clearAvatarType() {
      bitField0_ &= ~0x00000004;
      avatarType = 0;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 10;</code>
     * @return the avatarType
     */
    public AvatarTypeOuterClass.AvatarType getAvatarType() {
      return AvatarTypeOuterClass.AvatarType.forNumber(avatarType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link LineupSlotData#getAvatarType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getAvatarTypeValue() {
      return avatarType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link AvatarTypeOuterClass.AvatarType}. Setting an invalid value
     * can cause {@link LineupSlotData#getAvatarType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public LineupSlotData setAvatarTypeValue(final int value) {
      bitField0_ |= 0x00000004;
      avatarType = value;
      return this;
    }

    /**
     * <code>optional .AvatarType avatar_type = 10;</code>
     * @param value the avatarType to set
     * @return this
     */
    public LineupSlotData setAvatarType(final AvatarTypeOuterClass.AvatarType value) {
      bitField0_ |= 0x00000004;
      avatarType = value.getNumber();
      return this;
    }

    @Override
    public LineupSlotData copyFrom(final LineupSlotData other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        slotType = other.slotType;
        avatarType = other.avatarType;
      }
      return this;
    }

    @Override
    public LineupSlotData mergeFrom(final LineupSlotData other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasSlotType()) {
        setSlotType(other.slotType);
      }
      if (other.hasAvatarType()) {
        setAvatarTypeValue(other.avatarType);
      }
      return this;
    }

    @Override
    public LineupSlotData clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      slotType = 0;
      avatarType = 0;
      return this;
    }

    @Override
    public LineupSlotData clearQuick() {
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
      if (!(o instanceof LineupSlotData)) {
        return false;
      }
      LineupSlotData other = (LineupSlotData) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasSlotType() || slotType == other.slotType)
        && (!hasAvatarType() || avatarType == other.avatarType);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 24);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(slotType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeEnumNoTag(avatarType);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(slotType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(avatarType);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public LineupSlotData mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 24: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // slotType
            slotType = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // avatarType
            final int value = input.readInt32();
            if (AvatarTypeOuterClass.AvatarType.forNumber(value) != null) {
              avatarType = value;
              bitField0_ |= 0x00000004;
            }
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.slotType, slotType);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.avatarType, avatarType, AvatarTypeOuterClass.AvatarType.converter());
      }
      output.endObject();
    }

    @Override
    public LineupSlotData mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3355: {
            if (input.isAtField(FieldNames.id)) {
              if (!input.trySkipNullValue()) {
                id = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1086538152:
          case 687074523: {
            if (input.isAtField(FieldNames.slotType)) {
              if (!input.trySkipNullValue()) {
                slotType = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403148749:
          case 397309536: {
            if (input.isAtField(FieldNames.avatarType)) {
              if (!input.trySkipNullValue()) {
                final AvatarTypeOuterClass.AvatarType value = input.readEnum(AvatarTypeOuterClass.AvatarType.converter());
                if (value != null) {
                  avatarType = value.getNumber();
                  bitField0_ |= 0x00000004;
                } else {
                  input.skipUnknownEnumValue();
                }
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
    public LineupSlotData clone() {
      return new LineupSlotData().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static LineupSlotData parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new LineupSlotData(), data).checkInitialized();
    }

    public static LineupSlotData parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupSlotData(), input).checkInitialized();
    }

    public static LineupSlotData parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new LineupSlotData(), input).checkInitialized();
    }

    /**
     * @return factory for creating LineupSlotData messages
     */
    public static MessageFactory<LineupSlotData> getFactory() {
      return LineupSlotDataFactory.INSTANCE;
    }

    private enum LineupSlotDataFactory implements MessageFactory<LineupSlotData> {
      INSTANCE;

      @Override
      public LineupSlotData create() {
        return LineupSlotData.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");

      static final FieldName slotType = FieldName.forField("slotType", "slot_type");

      static final FieldName avatarType = FieldName.forField("avatarType", "avatar_type");
    }
  }
}
