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

public final class SceneGroupRefreshInfoOuterClass {
  /**
   * Protobuf type {@code SceneGroupRefreshInfo}
   */
  public static final class SceneGroupRefreshInfo extends ProtoMessage<SceneGroupRefreshInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 group_id = 5;</code>
     */
    private int groupId;

    /**
     * <code>optional uint32 state = 10;</code>
     */
    private int state;

    /**
     * <code>optional .SceneGroupRefreshType group_refresh_type = 11;</code>
     */
    private int groupRefreshType;

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     */
    private final RepeatedMessage<SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo> refreshEntity = RepeatedMessage.newEmptyInstance(SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo.getFactory());

    private SceneGroupRefreshInfo() {
    }

    /**
     * @return a new empty instance of {@code SceneGroupRefreshInfo}
     */
    public static SceneGroupRefreshInfo newInstance() {
      return new SceneGroupRefreshInfo();
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return whether the groupId field is set
     */
    public boolean hasGroupId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return this
     */
    public SceneGroupRefreshInfo clearGroupId() {
      bitField0_ &= ~0x00000001;
      groupId = 0;
      return this;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @return the groupId
     */
    public int getGroupId() {
      return groupId;
    }

    /**
     * <code>optional uint32 group_id = 5;</code>
     * @param value the groupId to set
     * @return this
     */
    public SceneGroupRefreshInfo setGroupId(final int value) {
      bitField0_ |= 0x00000001;
      groupId = value;
      return this;
    }

    /**
     * <code>optional uint32 state = 10;</code>
     * @return whether the state field is set
     */
    public boolean hasState() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 state = 10;</code>
     * @return this
     */
    public SceneGroupRefreshInfo clearState() {
      bitField0_ &= ~0x00000002;
      state = 0;
      return this;
    }

    /**
     * <code>optional uint32 state = 10;</code>
     * @return the state
     */
    public int getState() {
      return state;
    }

    /**
     * <code>optional uint32 state = 10;</code>
     * @param value the state to set
     * @return this
     */
    public SceneGroupRefreshInfo setState(final int value) {
      bitField0_ |= 0x00000002;
      state = value;
      return this;
    }

    /**
     * <code>optional .SceneGroupRefreshType group_refresh_type = 11;</code>
     * @return whether the groupRefreshType field is set
     */
    public boolean hasGroupRefreshType() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional .SceneGroupRefreshType group_refresh_type = 11;</code>
     * @return this
     */
    public SceneGroupRefreshInfo clearGroupRefreshType() {
      bitField0_ &= ~0x00000004;
      groupRefreshType = 0;
      return this;
    }

    /**
     * <code>optional .SceneGroupRefreshType group_refresh_type = 11;</code>
     * @return the groupRefreshType
     */
    public SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType getGroupRefreshType() {
      return SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType.forNumber(groupRefreshType);
    }

    /**
     * Gets the value of the internal enum store. The result is
     * equivalent to {@link SceneGroupRefreshInfo#getGroupRefreshType()}.getNumber().
     *
     * @return numeric wire representation
     */
    public int getGroupRefreshTypeValue() {
      return groupRefreshType;
    }

    /**
     * Sets the value of the internal enum store. This does not
     * do any validity checks, so be sure to use appropriate value
     * constants from {@link SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType}. Setting an invalid value
     * can cause {@link SceneGroupRefreshInfo#getGroupRefreshType()} to return null
     *
     * @param value the numeric wire value to set
     * @return this
     */
    public SceneGroupRefreshInfo setGroupRefreshTypeValue(final int value) {
      bitField0_ |= 0x00000004;
      groupRefreshType = value;
      return this;
    }

    /**
     * <code>optional .SceneGroupRefreshType group_refresh_type = 11;</code>
     * @param value the groupRefreshType to set
     * @return this
     */
    public SceneGroupRefreshInfo setGroupRefreshType(
        final SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType value) {
      bitField0_ |= 0x00000004;
      groupRefreshType = value.getNumber();
      return this;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     * @return whether the refreshEntity field is set
     */
    public boolean hasRefreshEntity() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     * @return this
     */
    public SceneGroupRefreshInfo clearRefreshEntity() {
      bitField0_ &= ~0x00000008;
      refreshEntity.clear();
      return this;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRefreshEntity()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo> getRefreshEntity(
        ) {
      return refreshEntity;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo> getMutableRefreshEntity(
        ) {
      bitField0_ |= 0x00000008;
      return refreshEntity;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     * @param value the refreshEntity to add
     * @return this
     */
    public SceneGroupRefreshInfo addRefreshEntity(
        final SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo value) {
      bitField0_ |= 0x00000008;
      refreshEntity.add(value);
      return this;
    }

    /**
     * <code>repeated .SceneEntityRefreshInfo refresh_entity = 6;</code>
     * @param values the refreshEntity to add
     * @return this
     */
    public SceneGroupRefreshInfo addAllRefreshEntity(
        final SceneEntityRefreshInfoOuterClass.SceneEntityRefreshInfo... values) {
      bitField0_ |= 0x00000008;
      refreshEntity.addAll(values);
      return this;
    }

    @Override
    public SceneGroupRefreshInfo copyFrom(final SceneGroupRefreshInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupId = other.groupId;
        state = other.state;
        groupRefreshType = other.groupRefreshType;
        refreshEntity.copyFrom(other.refreshEntity);
      }
      return this;
    }

    @Override
    public SceneGroupRefreshInfo mergeFrom(final SceneGroupRefreshInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupId()) {
        setGroupId(other.groupId);
      }
      if (other.hasState()) {
        setState(other.state);
      }
      if (other.hasGroupRefreshType()) {
        setGroupRefreshTypeValue(other.groupRefreshType);
      }
      if (other.hasRefreshEntity()) {
        getMutableRefreshEntity().addAll(other.refreshEntity);
      }
      return this;
    }

    @Override
    public SceneGroupRefreshInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupId = 0;
      state = 0;
      groupRefreshType = 0;
      refreshEntity.clear();
      return this;
    }

    @Override
    public SceneGroupRefreshInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      refreshEntity.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SceneGroupRefreshInfo)) {
        return false;
      }
      SceneGroupRefreshInfo other = (SceneGroupRefreshInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupId() || groupId == other.groupId)
        && (!hasState() || state == other.state)
        && (!hasGroupRefreshType() || groupRefreshType == other.groupRefreshType)
        && (!hasRefreshEntity() || refreshEntity.equals(other.refreshEntity));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 88);
        output.writeEnumNoTag(groupRefreshType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < refreshEntity.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(refreshEntity.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeEnumSizeNoTag(groupRefreshType);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * refreshEntity.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(refreshEntity);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SceneGroupRefreshInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // groupId
            groupId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // state
            state = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 88) {
              break;
            }
          }
          case 88: {
            // groupRefreshType
            final int value = input.readInt32();
            if (SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType.forNumber(value) != null) {
              groupRefreshType = value;
              bitField0_ |= 0x00000004;
            }
            tag = input.readTag();
            if (tag != 50) {
              break;
            }
          }
          case 50: {
            // refreshEntity
            tag = input.readRepeatedMessage(refreshEntity, tag);
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
        output.writeUInt32(FieldNames.groupId, groupId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.state, state);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeEnum(FieldNames.groupRefreshType, groupRefreshType, SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType.converter());
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.refreshEntity, refreshEntity);
      }
      output.endObject();
    }

    @Override
    public SceneGroupRefreshInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 293428218:
          case 506361563: {
            if (input.isAtField(FieldNames.groupId)) {
              if (!input.trySkipNullValue()) {
                groupId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 109757585: {
            if (input.isAtField(FieldNames.state)) {
              if (!input.trySkipNullValue()) {
                state = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 618900662:
          case 851738590: {
            if (input.isAtField(FieldNames.groupRefreshType)) {
              if (!input.trySkipNullValue()) {
                final SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType value = input.readEnum(SceneGroupRefreshTypeOuterClass.SceneGroupRefreshType.converter());
                if (value != null) {
                  groupRefreshType = value.getNumber();
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
          case 2113180318:
          case -1873514041: {
            if (input.isAtField(FieldNames.refreshEntity)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(refreshEntity);
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
    public SceneGroupRefreshInfo clone() {
      return new SceneGroupRefreshInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SceneGroupRefreshInfo parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshInfo(), data).checkInitialized();
    }

    public static SceneGroupRefreshInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshInfo(), input).checkInitialized();
    }

    public static SceneGroupRefreshInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SceneGroupRefreshInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating SceneGroupRefreshInfo messages
     */
    public static MessageFactory<SceneGroupRefreshInfo> getFactory() {
      return SceneGroupRefreshInfoFactory.INSTANCE;
    }

    private enum SceneGroupRefreshInfoFactory implements MessageFactory<SceneGroupRefreshInfo> {
      INSTANCE;

      @Override
      public SceneGroupRefreshInfo create() {
        return SceneGroupRefreshInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupId = FieldName.forField("groupId", "group_id");

      static final FieldName state = FieldName.forField("state");

      static final FieldName groupRefreshType = FieldName.forField("groupRefreshType", "group_refresh_type");

      static final FieldName refreshEntity = FieldName.forField("refreshEntity", "refresh_entity");
    }
  }
}
