/* (C)2024 */
package com.coze.openapi.client.chat;

import com.coze.openapi.client.chat.model.Chat;
import com.coze.openapi.client.common.BaseResp;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CreateChatResp extends BaseResp {
  private Chat chat;
}
