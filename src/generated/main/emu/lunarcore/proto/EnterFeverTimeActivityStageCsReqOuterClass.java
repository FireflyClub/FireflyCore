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

public final class EnterFeverTimeActivityStageCsReqOuterClass {
  /**
   * Protobuf type {@code EnterFeverTimeActivityStageCsReq}
   */
  public static final class EnterFeverTimeActivityStageCsReq extends ProtoMessage<EnterFeverTimeActivityStageCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 id = 8;</code>
     */
    private int id;

    /**
     * <code>optional uint32 ADNPPCILFMA = 12;</code>
     */
    private int aDNPPCILFMA;

    /**
     * <code>optional uint32 BOOHBIJBBIA = 13;</code>
     */
    private int bOOHBIJBBIA;

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     */
    private final RepeatedMessage<FeverTimeAvatarOuterClass.FeverTimeAvatar> avatarList = RepeatedMessage.newEmptyInstance(FeverTimeAvatarOuterClass.FeverTimeAvatar.getFactory());

    private EnterFeverTimeActivityStageCsReq() {
    }

    /**
     * @return a new empty instance of {@code EnterFeverTimeActivityStageCsReq}
     */
    public static EnterFeverTimeActivityStageCsReq newInstance() {
      return new EnterFeverTimeActivityStageCsReq();
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return whether the id field is set
     */
    public boolean hasId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq clearId() {
      bitField0_ &= ~0x00000001;
      id = 0;
      return this;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @return the id
     */
    public int getId() {
      return id;
    }

    /**
     * <code>optional uint32 id = 8;</code>
     * @param value the id to set
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq setId(final int value) {
      bitField0_ |= 0x00000001;
      id = value;
      return this;
    }

    /**
     * <code>optional uint32 ADNPPCILFMA = 12;</code>
     * @return whether the aDNPPCILFMA field is set
     */
    public boolean hasADNPPCILFMA() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 ADNPPCILFMA = 12;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq clearADNPPCILFMA() {
      bitField0_ &= ~0x00000002;
      aDNPPCILFMA = 0;
      return this;
    }

    /**
     * <code>optional uint32 ADNPPCILFMA = 12;</code>
     * @return the aDNPPCILFMA
     */
    public int getADNPPCILFMA() {
      return aDNPPCILFMA;
    }

    /**
     * <code>optional uint32 ADNPPCILFMA = 12;</code>
     * @param value the aDNPPCILFMA to set
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq setADNPPCILFMA(final int value) {
      bitField0_ |= 0x00000002;
      aDNPPCILFMA = value;
      return this;
    }

    /**
     * <code>optional uint32 BOOHBIJBBIA = 13;</code>
     * @return whether the bOOHBIJBBIA field is set
     */
    public boolean hasBOOHBIJBBIA() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 BOOHBIJBBIA = 13;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq clearBOOHBIJBBIA() {
      bitField0_ &= ~0x00000004;
      bOOHBIJBBIA = 0;
      return this;
    }

    /**
     * <code>optional uint32 BOOHBIJBBIA = 13;</code>
     * @return the bOOHBIJBBIA
     */
    public int getBOOHBIJBBIA() {
      return bOOHBIJBBIA;
    }

    /**
     * <code>optional uint32 BOOHBIJBBIA = 13;</code>
     * @param value the bOOHBIJBBIA to set
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq setBOOHBIJBBIA(final int value) {
      bitField0_ |= 0x00000004;
      bOOHBIJBBIA = value;
      return this;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     * @return whether the avatarList field is set
     */
    public boolean hasAvatarList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq clearAvatarList() {
      bitField0_ &= ~0x00000008;
      avatarList.clear();
      return this;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAvatarList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<FeverTimeAvatarOuterClass.FeverTimeAvatar> getAvatarList() {
      return avatarList;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<FeverTimeAvatarOuterClass.FeverTimeAvatar> getMutableAvatarList() {
      bitField0_ |= 0x00000008;
      return avatarList;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     * @param value the avatarList to add
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq addAvatarList(
        final FeverTimeAvatarOuterClass.FeverTimeAvatar value) {
      bitField0_ |= 0x00000008;
      avatarList.add(value);
      return this;
    }

    /**
     * <code>repeated .FeverTimeAvatar avatar_list = 3;</code>
     * @param values the avatarList to add
     * @return this
     */
    public EnterFeverTimeActivityStageCsReq addAllAvatarList(
        final FeverTimeAvatarOuterClass.FeverTimeAvatar... values) {
      bitField0_ |= 0x00000008;
      avatarList.addAll(values);
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageCsReq copyFrom(final EnterFeverTimeActivityStageCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        id = other.id;
        aDNPPCILFMA = other.aDNPPCILFMA;
        bOOHBIJBBIA = other.bOOHBIJBBIA;
        avatarList.copyFrom(other.avatarList);
      }
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageCsReq mergeFrom(
        final EnterFeverTimeActivityStageCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasId()) {
        setId(other.id);
      }
      if (other.hasADNPPCILFMA()) {
        setADNPPCILFMA(other.aDNPPCILFMA);
      }
      if (other.hasBOOHBIJBBIA()) {
        setBOOHBIJBBIA(other.bOOHBIJBBIA);
      }
      if (other.hasAvatarList()) {
        getMutableAvatarList().addAll(other.avatarList);
      }
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      id = 0;
      aDNPPCILFMA = 0;
      bOOHBIJBBIA = 0;
      avatarList.clear();
      return this;
    }

    @Override
    public EnterFeverTimeActivityStageCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      avatarList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof EnterFeverTimeActivityStageCsReq)) {
        return false;
      }
      EnterFeverTimeActivityStageCsReq other = (EnterFeverTimeActivityStageCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasId() || id == other.id)
        && (!hasADNPPCILFMA() || aDNPPCILFMA == other.aDNPPCILFMA)
        && (!hasBOOHBIJBBIA() || bOOHBIJBBIA == other.bOOHBIJBBIA)
        && (!hasAvatarList() || avatarList.equals(other.avatarList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(aDNPPCILFMA);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(bOOHBIJBBIA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < avatarList.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(avatarList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(aDNPPCILFMA);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(bOOHBIJBBIA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * avatarList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(avatarList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public EnterFeverTimeActivityStageCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // id
            id = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // aDNPPCILFMA
            aDNPPCILFMA = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // bOOHBIJBBIA
            bOOHBIJBBIA = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // avatarList
            tag = input.readRepeatedMessage(avatarList, tag);
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
        output.writeUInt32(FieldNames.id, id);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.aDNPPCILFMA, aDNPPCILFMA);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.bOOHBIJBBIA, bOOHBIJBBIA);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedMessage(FieldNames.avatarList, avatarList);
      }
      output.endObject();
    }

    @Override
    public EnterFeverTimeActivityStageCsReq mergeFrom(final JsonSource input) throws IOException {
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
          case 1396362623: {
            if (input.isAtField(FieldNames.aDNPPCILFMA)) {
              if (!input.trySkipNullValue()) {
                aDNPPCILFMA = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -500058347: {
            if (input.isAtField(FieldNames.bOOHBIJBBIA)) {
              if (!input.trySkipNullValue()) {
                bOOHBIJBBIA = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -403402345:
          case 397055940: {
            if (input.isAtField(FieldNames.avatarList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(avatarList);
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
    public EnterFeverTimeActivityStageCsReq clone() {
      return new EnterFeverTimeActivityStageCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static EnterFeverTimeActivityStageCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageCsReq(), data).checkInitialized();
    }

    public static EnterFeverTimeActivityStageCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageCsReq(), input).checkInitialized();
    }

    public static EnterFeverTimeActivityStageCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new EnterFeverTimeActivityStageCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating EnterFeverTimeActivityStageCsReq messages
     */
    public static MessageFactory<EnterFeverTimeActivityStageCsReq> getFactory() {
      return EnterFeverTimeActivityStageCsReqFactory.INSTANCE;
    }

    private enum EnterFeverTimeActivityStageCsReqFactory implements MessageFactory<EnterFeverTimeActivityStageCsReq> {
      INSTANCE;

      @Override
      public EnterFeverTimeActivityStageCsReq create() {
        return EnterFeverTimeActivityStageCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName id = FieldName.forField("id");

      static final FieldName aDNPPCILFMA = FieldName.forField("ADNPPCILFMA");

      static final FieldName bOOHBIJBBIA = FieldName.forField("BOOHBIJBBIA");

      static final FieldName avatarList = FieldName.forField("avatarList", "avatar_list");
    }
  }
}
