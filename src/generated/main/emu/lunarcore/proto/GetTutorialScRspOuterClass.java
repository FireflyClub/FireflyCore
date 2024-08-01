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

public final class GetTutorialScRspOuterClass {
  /**
   * Protobuf type {@code GetTutorialScRsp}
   */
  public static final class GetTutorialScRsp extends ProtoMessage<GetTutorialScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 14;</code>
     */
    private int retcode;

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     */
    private final RepeatedMessage<TutorialOuterClass.Tutorial> tutorialList = RepeatedMessage.newEmptyInstance(TutorialOuterClass.Tutorial.getFactory());

    private GetTutorialScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetTutorialScRsp}
     */
    public static GetTutorialScRsp newInstance() {
      return new GetTutorialScRsp();
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return this
     */
    public GetTutorialScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 14;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetTutorialScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     * @return whether the tutorialList field is set
     */
    public boolean hasTutorialList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     * @return this
     */
    public GetTutorialScRsp clearTutorialList() {
      bitField0_ &= ~0x00000002;
      tutorialList.clear();
      return this;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTutorialList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<TutorialOuterClass.Tutorial> getTutorialList() {
      return tutorialList;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<TutorialOuterClass.Tutorial> getMutableTutorialList() {
      bitField0_ |= 0x00000002;
      return tutorialList;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     * @param value the tutorialList to add
     * @return this
     */
    public GetTutorialScRsp addTutorialList(final TutorialOuterClass.Tutorial value) {
      bitField0_ |= 0x00000002;
      tutorialList.add(value);
      return this;
    }

    /**
     * <code>repeated .Tutorial tutorial_list = 9;</code>
     * @param values the tutorialList to add
     * @return this
     */
    public GetTutorialScRsp addAllTutorialList(final TutorialOuterClass.Tutorial... values) {
      bitField0_ |= 0x00000002;
      tutorialList.addAll(values);
      return this;
    }

    @Override
    public GetTutorialScRsp copyFrom(final GetTutorialScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        tutorialList.copyFrom(other.tutorialList);
      }
      return this;
    }

    @Override
    public GetTutorialScRsp mergeFrom(final GetTutorialScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTutorialList()) {
        getMutableTutorialList().addAll(other.tutorialList);
      }
      return this;
    }

    @Override
    public GetTutorialScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      tutorialList.clear();
      return this;
    }

    @Override
    public GetTutorialScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      tutorialList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetTutorialScRsp)) {
        return false;
      }
      GetTutorialScRsp other = (GetTutorialScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTutorialList() || tutorialList.equals(other.tutorialList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < tutorialList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(tutorialList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * tutorialList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(tutorialList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetTutorialScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 112: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // tutorialList
            tag = input.readRepeatedMessage(tutorialList, tag);
            bitField0_ |= 0x00000002;
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
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.tutorialList, tutorialList);
      }
      output.endObject();
    }

    @Override
    public GetTutorialScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 608727324:
          case 1708304607: {
            if (input.isAtField(FieldNames.tutorialList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(tutorialList);
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
    public GetTutorialScRsp clone() {
      return new GetTutorialScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetTutorialScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetTutorialScRsp(), data).checkInitialized();
    }

    public static GetTutorialScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetTutorialScRsp(), input).checkInitialized();
    }

    public static GetTutorialScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetTutorialScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetTutorialScRsp messages
     */
    public static MessageFactory<GetTutorialScRsp> getFactory() {
      return GetTutorialScRspFactory.INSTANCE;
    }

    private enum GetTutorialScRspFactory implements MessageFactory<GetTutorialScRsp> {
      INSTANCE;

      @Override
      public GetTutorialScRsp create() {
        return GetTutorialScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName tutorialList = FieldName.forField("tutorialList", "tutorial_list");
    }
  }
}
