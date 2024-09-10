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

public final class GroupStateChangeCsReqOuterClass {
  /**
   * Protobuf type {@code GroupStateChangeCsReq}
   */
  public static final class GroupStateChangeCsReq extends ProtoMessage<GroupStateChangeCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     */
    private final GroupStateInfoOuterClass.GroupStateInfo groupStateInfo = GroupStateInfoOuterClass.GroupStateInfo.newInstance();

    private GroupStateChangeCsReq() {
    }

    /**
     * @return a new empty instance of {@code GroupStateChangeCsReq}
     */
    public static GroupStateChangeCsReq newInstance() {
      return new GroupStateChangeCsReq();
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     * @return whether the groupStateInfo field is set
     */
    public boolean hasGroupStateInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     * @return this
     */
    public GroupStateChangeCsReq clearGroupStateInfo() {
      bitField0_ &= ~0x00000001;
      groupStateInfo.clear();
      return this;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableGroupStateInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public GroupStateInfoOuterClass.GroupStateInfo getGroupStateInfo() {
      return groupStateInfo;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public GroupStateInfoOuterClass.GroupStateInfo getMutableGroupStateInfo() {
      bitField0_ |= 0x00000001;
      return groupStateInfo;
    }

    /**
     * <code>optional .GroupStateInfo group_state_info = 15;</code>
     * @param value the groupStateInfo to set
     * @return this
     */
    public GroupStateChangeCsReq setGroupStateInfo(
        final GroupStateInfoOuterClass.GroupStateInfo value) {
      bitField0_ |= 0x00000001;
      groupStateInfo.copyFrom(value);
      return this;
    }

    @Override
    public GroupStateChangeCsReq copyFrom(final GroupStateChangeCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        groupStateInfo.copyFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public GroupStateChangeCsReq mergeFrom(final GroupStateChangeCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasGroupStateInfo()) {
        getMutableGroupStateInfo().mergeFrom(other.groupStateInfo);
      }
      return this;
    }

    @Override
    public GroupStateChangeCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupStateInfo.clear();
      return this;
    }

    @Override
    public GroupStateChangeCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      groupStateInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GroupStateChangeCsReq)) {
        return false;
      }
      GroupStateChangeCsReq other = (GroupStateChangeCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasGroupStateInfo() || groupStateInfo.equals(other.groupStateInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 122);
        output.writeMessageNoTag(groupStateInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(groupStateInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GroupStateChangeCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 122: {
            // groupStateInfo
            input.readMessage(groupStateInfo);
            bitField0_ |= 0x00000001;
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
        output.writeMessage(FieldNames.groupStateInfo, groupStateInfo);
      }
      output.endObject();
    }

    @Override
    public GroupStateChangeCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1415312672:
          case 1198732636: {
            if (input.isAtField(FieldNames.groupStateInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(groupStateInfo);
                bitField0_ |= 0x00000001;
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
    public GroupStateChangeCsReq clone() {
      return new GroupStateChangeCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GroupStateChangeCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GroupStateChangeCsReq(), data).checkInitialized();
    }

    public static GroupStateChangeCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateChangeCsReq(), input).checkInitialized();
    }

    public static GroupStateChangeCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GroupStateChangeCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GroupStateChangeCsReq messages
     */
    public static MessageFactory<GroupStateChangeCsReq> getFactory() {
      return GroupStateChangeCsReqFactory.INSTANCE;
    }

    private enum GroupStateChangeCsReqFactory implements MessageFactory<GroupStateChangeCsReq> {
      INSTANCE;

      @Override
      public GroupStateChangeCsReq create() {
        return GroupStateChangeCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName groupStateInfo = FieldName.forField("groupStateInfo", "group_state_info");
    }
  }
}
